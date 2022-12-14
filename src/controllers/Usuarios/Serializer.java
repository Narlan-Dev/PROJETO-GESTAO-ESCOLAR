/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Usuarios;

import java.io.*;
import models.CustomExceptions.FileExistsException;
import models.Registros.Registro;

public class Serializer <T extends Registro> {
    
    private boolean checkIfFileExists(String fileName){
        File file = new File(fileName);
        return (file.exists());
    }
    
    public void serializeObject(T objeto, boolean force){
        try {
            FileOutputStream fos = new FileOutputStream(objeto.getPathName());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void serializeObject(T objeto){
        if(checkIfFileExists(objeto.getPathName())){
            throw new FileExistsException();
        }
        try {
            FileOutputStream fos = new FileOutputStream(objeto.getPathName());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(objeto);
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}