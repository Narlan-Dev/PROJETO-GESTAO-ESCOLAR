package models.Usuario;

public abstract class Usuario {
    private String name;
    private String matricula;
    private String passoword;
    private String type;
    
    public String getName(){
        return this.name;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getPassowrd(){
        return this.passoword;
    }
    public String getType(){
        return this.type;
    }
    
    public Usuario(String name, String matricula, String passoword, String type){
        this.name = name;
        this.matricula = matricula;
        this.passoword = passoword;
        this.type = type;
    }
}
