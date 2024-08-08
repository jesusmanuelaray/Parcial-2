/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudio_parcial;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Collections;

import java.util.Map;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class ComidaProvider {
    
    CollectionReference reference;
    static Firestore db;
    
    public static boolean guardarComida(String Coleccion, String Documento, Map<String, Object> data){
        
      
        db = FirestoreClient.getFirestore();
        
        try{
            DocumentReference docRef = db.collection(Coleccion).document(Documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado correctamente");
            return true;
        }catch(Exception e){
            
        }
        return false;
    }
    /*
    public static void cargarTabla(JTable jtable){
        try{
            CollectionReference comida = Conexión.db.collection("Comida");
            ApiFuture<QuerySnapshot> querySnap = Comida.get();
        }catch(Exception e){
            
        }
    }*/
}
