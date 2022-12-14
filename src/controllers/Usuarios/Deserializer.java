/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Usuarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Registros.Registro;
/**
 *
 * @author Unknown
 */
public class Deserializer <T extends Registro> {
    
    public Deserializer(){
        
    }
    
    public ArrayList<T> deserializeObject(T objeto) throws FileNotFoundException, IOException{
        
        ArrayList<T> lista = new ArrayList<>();
        
        File directoryPath = new File(objeto.getPath());
        String [] fileNames = directoryPath.list();
        
        for (String fileName : fileNames){
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream oin = new ObjectInputStream(file);
            try {
                lista.add((T) oin.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Deserializer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return lista;
    }
    
    
    
}
