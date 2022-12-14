package models.Registros.Contatos;

import models.Registros.Registro;

import java.io.Serial;
import java.io.Serializable;

@SuppressWarnings("unused")
public class Contato implements Serializable{

    @Serial
    private static final long serialVersionUID = 0L;
    private ContatosEnumeration tipoContato;
    private String contato;
    
    public Contato(ContatosEnumeration tipoContato, String contato){
        this.tipoContato = tipoContato;
        this.contato = contato;
    }

    public ContatosEnumeration getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(ContatosEnumeration tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "Contato[]";
    }

    public Object getSerialized() {
        return null;
    }

    public String getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
