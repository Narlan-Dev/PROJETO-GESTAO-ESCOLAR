package controllers.Alunos;
import controllers.Controller;
import controllers.Usuarios.Serializer;
import javax.swing.JOptionPane;
import models.Coordenador.Sala;
import models.CustomExceptions.FileExistsException;
import models.Registros.Alunos;

public class ControllerAlunos implements Controller<Alunos> {
    private Serializer<Alunos> serializer = new Serializer<>();
    
    @Override
    public void add(Alunos aluno) {
        //alunos.put(aluno, aluno.getName());
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
    public void delete(Alunos element) {
        //Implementar
    }
    public void shearchBySala(Sala sala){
        //Implementar
    }
    
}
