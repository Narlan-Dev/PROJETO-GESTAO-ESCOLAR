package controllers.Usuarios;
import controllers.Controller;
import java.util.HashMap;
import java.util.Map;
import models.Usuario.Usuario;

public class Usuarios implements Controller{
    private static final Map<Usuario, String> usuarios = new HashMap<>();
    
    public static void add(Usuario user){
        usuarios.put(user, user.getMatricula());
    }
    public static Usuario shearchByMatriculaAndSenha(String matricula, String senha){
        for(Usuario user : usuarios.keySet()){
            if(user.getMatricula().equals(matricula)&&user.getPassowrd().equals(senha)){
                return user;
            }
        }
        throw new NullPointerException();
    }
        
    /*public static Map<Object, Icon> getMap(){
        return icons;
    }*/
}
