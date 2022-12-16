package controllers.RegistrosControllers;
import controllers.Controller;
import controllers.SerializationManager.Deserializer;
import controllers.SerializationManager.Serializer;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Coordenador.Sala;
import models.CustomExceptions.FileExistsException;
import models.CustomExceptions.ReachingMaximumCapacity;
import models.Registros.Alunos;

public class ControllerAlunos implements Controller<Alunos> {
    private Serializer<Alunos> serializer = new Serializer<>();
    private Deserializer<Alunos> des = new Deserializer<>();
    
    public void add(Alunos aluno, Sala sala) throws ReachingMaximumCapacity {
        if(searchBySala(sala).size() < sala.getCapacidadeMax()){
            try{
                serializer.serializeObject(aluno);
            } catch (FileExistsException e){
                int OPTION = JOptionPane.showConfirmDialog(null, "Sobrescrever registro já existente?", "", JOptionPane.OK_CANCEL_OPTION);
                if (OPTION == JOptionPane.OK_OPTION){
                    serializer.serializeObject(aluno, true);
                }
            }
        }else{
            throw new ReachingMaximumCapacity();
        }
    }
    
    @Override
    public void update(Alunos aluno, String text, String txt) {
        serializer.serializeObject(aluno, true);  
    }
    @Override
    public void delete(Alunos aluno) {
        des.delete(aluno);
    }
    public List<Alunos> searchBySala(Sala sala){
        List<Alunos> alunos = des.deserializeObject(new Alunos());
        List<Alunos> alunosf = null;
        try{
            alunosf = alunos.stream()
                    .filter(aluno -> aluno.getSala().getName().equals(sala.getName()))
                    .collect(Collectors.toList());
        } catch (RuntimeException e){
            
        }
        return alunosf;
    }

    @Override
    public void add(Alunos elemnt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
