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
import models.Registros.Alunos;
import models.Registros.Professores;
import models.Registros.Registro;
/**
 *
 * @author Unknown
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class Deserializer <T extends Registro> {
    
    public Deserializer(){
        
    }

    public ArrayList<T> deserializeObject(T objeto){
        
        ArrayList<T> lista = new ArrayList<T>();
        
        File directoryPath = new File(objeto.getPath());
        String [] fileNames = directoryPath.list();

        for (String fileName : fileNames){
            FileInputStream file = null;
            try {
                file = new FileInputStream(new File(directoryPath, fileName));
                ObjectInputStream oin = new ObjectInputStream(file);
                try {
                    lista.add((T) oin.readObject());
                } catch (ClassNotFoundException ex) {
                    System.out.println("deu ruim aqui, cabeça");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Deserializer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Deserializer.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    file.close();
                } catch (IOException ex) {
                    Logger.getLogger(Deserializer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }
    
    public static void main(String[] args) throws IOException {
        Deserializer des = new Deserializer();
        ArrayList<Professores> alunos = (ArrayList<Professores>) des.deserializeObject(new Professores());
        for (Professores aluno : alunos){
            System.out.println(aluno);
        }
    }
    
}
