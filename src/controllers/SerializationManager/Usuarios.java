package controllers.SerializationManager;
import controllers.Controller;
import java.util.HashMap;
import java.util.Map;
import models.Usuario.Usuario;

public class Usuarios implements Controller<Usuario>{
    private static final Map<Usuario, String> usuarios = new HashMap<>();
    
    @Override
    public void add(Usuario user){
        usuarios.put(user, user.getMatricula());
    }
    public Usuario shearchByMatriculaAndSenha(String matricula, String senha){
        for(Usuario user : usuarios.keySet()){
            if(user.getMatricula().equals(matricula)&&user.getPassowrd().equals(senha)){
                return user;
            }
        }
        throw new NullPointerException();
    } 

    @Override
    public void update(Usuario element, String text, String txt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Usuario element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
