package models.Registros;

public class Turma implements Registro{
    private String id;
    private String sala;
    private String ano;

    public Turma() {
    }

    public Turma(String id, String sala, String ano) {
        this.id = id;
        this.sala = sala;
        this.ano = ano;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    @Override
    public Object getSerialized() {
        return null;
    }
}
