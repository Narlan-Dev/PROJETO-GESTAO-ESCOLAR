package models.Coordenador;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Sala {
    private Icon iconSala = new ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconSalas.png"));
    private String nome ="";
    
    public Icon getIcon(){
        return this.iconSala;
    }
    public String getName(){
        return this.nome;
    }
    
    public Sala(String name){
        this.nome = name;
    }
}   
