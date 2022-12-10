package models.Coordenador;

public class Sala {
    private String icon ="C:\\Narlan\\PROJETOS\\PROJETO_GESTAO_ESCOLAR\\src\\views\\Cordenador\\Resources\\iconSalas.PNG";
    private String nome ="";
    
    public String getIcon(){
        return this.icon;
    }
    public String getName(){
        return this.nome;
    }
    
    public Sala(String name){
        this.nome = name;
    }
}   
