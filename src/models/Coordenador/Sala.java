package models.Coordenador;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Sala {
    private Icon iconSala = new ImageIcon(getClass().getResource("/views/Cordenador/Resources/iconSalas.png"));
    private String nome ="";
    private int capacidadeMax;
    
    public Icon getIcon(){
        return this.iconSala;
    }
    public String getName(){
        return this.nome;
    }
    public int getCapacidadeMax(){
        return this.capacidadeMax;
    }
    public void setCapacidadeMax(int newValor){
        this.capacidadeMax = newValor;
    }
    
    public Sala(String name, int capacidadeMax){
        this.nome = name;
        this.capacidadeMax = capacidadeMax;
    }
}   
