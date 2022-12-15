package models.Coordenador;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.Registros.Registro;
import models.Registros.RegistroEnumeration;

public class Sala implements Registro{
    private Map<String, Boolean> diciplinasDicionario = new HashMap<>();
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
    public void setName(String name){
        this.nome = name;
    }
    public void setCapacidadeMax(int newValor){
        this.capacidadeMax = newValor;
    }
    public Map<String, Boolean> getDiciplinaDicionario(){
        return this.diciplinasDicionario;
    }
    public void setDiciplinaDisponibilidade(String name, Boolean modo){
        this.diciplinasDicionario.replace(name, modo);
    }
    
    public Sala(String name, int capacidadeMax){
        this.nome = name;
        this.capacidadeMax = capacidadeMax;
        String[] diciplinas = {"Matemética", "Português", "Geografia", "Ciências"};
        for(int i = 0; i < diciplinas.length; i++) {
            this.diciplinasDicionario.put(diciplinas[i], false);
        }
    }

    @Override
    public String getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPath() {
        return RegistroEnumeration.TURMAS.directoryPath;
    }

    @Override
    public String getPathName() {
        return RegistroEnumeration.TURMAS.directoryPath + this.nome;
    }
}   
