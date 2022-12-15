package controllers.Alunos;
import controllers.Controller;
import controllers.Usuarios.Serializer;
import models.Coordenador.Sala;
import models.Registros.Alunos;

public class ControllerAlunos implements Controller<Alunos> {
    private Serializer<Alunos> serializer = new Serializer<>();
    
    @Override
    public void add(Alunos aluno) {
        //alunos.put(aluno, aluno.getName());
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
