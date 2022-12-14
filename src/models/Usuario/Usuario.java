package models.Usuario;

public abstract class Usuario {
    private String name;
    private String matricula;
    private String passoword;
    
    public String getName(){
        return this.name;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getPassowrd(){
        return this.passoword;
    }

    public Usuario(String name, String matricula, String passoword){
        this.name = name;
        this.matricula = matricula;
        this.passoword = passoword;
    }
}
