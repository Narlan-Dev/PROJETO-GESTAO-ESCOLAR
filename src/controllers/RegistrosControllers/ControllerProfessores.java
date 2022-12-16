/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.RegistrosControllers;

import controllers.Controller;
import controllers.SerializationManager.Deserializer;
import controllers.SerializationManager.Serializer;
import javax.swing.JOptionPane;
import models.CustomExceptions.FileExistsException;
import models.Registros.Professores;

/**
 *
 * @author Unknown
 */
public class ControllerProfessores implements Controller<Professores>{
    private Serializer<Professores> serializer = new Serializer<>();
        private Deserializer<Professores> des = new Deserializer<>();


    @Override
    public void add(Professores professor) {
        try{
            serializer.serializeObject(professor);
        } catch (FileExistsException e){
            int OPTION = JOptionPane.showConfirmDialog(null, "Sobrescrever registro já existente?", "", JOptionPane.OK_CANCEL_OPTION);
            if (OPTION == JOptionPane.OK_OPTION){
                serializer.serializeObject(professor, true);
            }
        }
    }    

    @Override
    public void update(Professores element, String text, String txt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Professores professor) {
        des.delete(professor);
    }
    
}
