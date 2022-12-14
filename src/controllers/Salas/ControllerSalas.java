package controllers.Salas;
import controllers.Controller;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import models.Coordenador.Sala;


public class ControllerSalas implements Controller<Sala> {
    private static final Map<Object, Icon> icons = new HashMap<>();
    private static final Map<Sala, String> salas = new HashMap<>();
    

    @Override
    public void add(Sala sala){
        icons.put(sala.getName(), sala.getIcon());
        salas.put(sala, sala.getName());
    }
    public Sala shearchByName(String name){
        for(Sala turma : salas.keySet()){
            if(turma.getName().equals(name)){
                return turma;
            }
        }
        throw new NullPointerException();
    }
    public void updateAllList(DefaultListModel list){
        list.clear();
        for(Sala turma : salas.keySet()){
            list.addElement(turma.getName());
        }
    }
    @Override
    public void update(Sala sala, String name, String capacidadeMax){
        icons.clear();
        sala.setName(name);
        for(Sala turma : salas.keySet()){
            icons.put(turma.getName(), turma.getIcon());
        }
        sala.setCapacidadeMax(Integer.parseInt(capacidadeMax));
    }
    @Override
    public void delete(Sala sala){
        icons.remove(sala.getName());
        salas.remove(sala);
    }
    public Map<Object, Icon> getMap(){
        return icons;
    }

}
