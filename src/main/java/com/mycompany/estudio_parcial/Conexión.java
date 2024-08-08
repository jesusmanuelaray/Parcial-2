/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudio_parcial;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class Conexión {
    public static Firestore db;
    public static void ConectarFirebase(){
        try{
            FileInputStream serviceAccount = new FileInputStream("C://Users//ACER//Documents//JAVA//Estudio_parcial//proyecto-de-prueba.json");
        
        FirebaseOptions options = new FirebaseOptions.Builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://proyecto-de-prueba-24e04-default-rtdb.firebaseio.com")
            .build();

            FirebaseApp.initializeApp(options);

            System.out.println("Conexión exitosa");
        }catch(IOException e){
            System.out.println("No se pudo conectar");
        }
        
    }
}
