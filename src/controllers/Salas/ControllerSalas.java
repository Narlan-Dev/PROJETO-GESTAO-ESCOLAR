package controllers.Salas;
import controllers.Controller;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import models.Coordenador.Sala;


public abstract class ControllerSalas implements Controller {
    private static final Map<Object, Icon> icons = new HashMap<>();
    private static final Map<Sala, String> salas = new HashMap<>();
    

    public static void add(Sala sala){
        icons.put(sala.getName(), sala.getIcon());
        salas.put(sala, sala.getName());
    }
    public static Sala shearchByName(String name){
        for(Sala turma : salas.keySet()){
            if(turma.getName().equals(name)){
                return turma;
            }
        }
        throw new NullPointerException();
    }
    public static void updateAllList(DefaultListModel list){
        list.clear();
        for(Sala turma : salas.keySet()){
            list.addElement(turma.getName());
        }
    }
    public static Map<Object, Icon> getMap(){
        return icons;
    }
}
