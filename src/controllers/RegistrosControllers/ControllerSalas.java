package controllers.RegistrosControllers;
import controllers.Controller;
import controllers.SerializationManager.Deserializer;
import controllers.SerializationManager.Serializer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import models.CustomExceptions.FileExistsException;
import models.Registros.Sala;
import models.Registros.Alunos;


public class ControllerSalas implements Controller<Sala> {
    public static final Map<Object, Icon> icons = new HashMap<>();
    public static final Map<Sala, String> salas = new HashMap<>();
    private Serializer<Sala> serializer = new Serializer<>();
    private Deserializer<Sala> des = new Deserializer<>();
    private List<Alunos> alunos;
    private ControllerAlunos controllerAlunos = new ControllerAlunos();
    

    @Override
    public void add(Sala sala){
        icons.put(sala.getName(), sala.getIcon());
        salas.put(sala, sala.getName());
        
        try{
            serializer.serializeObject(sala);
        } catch (FileExistsException e){
            int OPTION = JOptionPane.showConfirmDialog(null, "Sobrescrever registro já existente?", "", JOptionPane.OK_CANCEL_OPTION);
            if (OPTION == JOptionPane.OK_OPTION){
                serializer.serializeObject(sala, true);
            }
        }
        
    }
    public Sala searchByName(String name){
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
        alunos = controllerAlunos.searchBySala(sala);
        des.delete(sala);
        sala.setName(name);
        for (Alunos aluno : alunos){
            aluno.setSala(sala);
            controllerAlunos.update(aluno, name, name);
        }
        
        for(Sala turma : salas.keySet()){
            icons.put(turma.getName(), turma.getIcon());
        }
        sala.setCapacidadeMax(Integer.parseInt(capacidadeMax));
        serializer.serializeObject(sala, true);  
    }
    
    public List<Sala> deserializeAll(){
        return des.deserializeObject(new Sala());
    }
    
    @Override
    public void delete(Sala sala){
        icons.remove(sala.getName());
        salas.remove(sala);
        des.delete(sala);
    }
    public Map<Object, Icon> getMap(){
        return icons;
    }

}
