package controllers.RegistrosControllers;
import controllers.Controller;
import controllers.SerializationManager.Deserializer;
import controllers.SerializationManager.Serializer;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Coordenador.Sala;
import models.CustomExceptions.FileExistsException;
import models.Registros.Alunos;

public class ControllerAlunos implements Controller<Alunos> {
    private Serializer<Alunos> serializer = new Serializer<>();
    private Deserializer<Alunos> des = new Deserializer<>();
    
    @Override
    public void add(Alunos aluno) {
        try{
            serializer.serializeObject(aluno);
        } catch (FileExistsException e){
            int OPTION = JOptionPane.showConfirmDialog(null, "Sobrescrever registro já existente?", "", JOptionPane.OK_CANCEL_OPTION);
            if (OPTION == JOptionPane.OK_OPTION){
                serializer.serializeObject(aluno, true);
            }
        }
    }
    
    @Override
    public void update(Alunos element, String text, String txt) {
        //Implementar
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
    
}
