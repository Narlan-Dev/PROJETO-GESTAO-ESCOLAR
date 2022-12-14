package models.Contatos;

import models.Registros.Registro;

import java.io.Serial;

@SuppressWarnings("unused")
public class Contato implements Registro{

    @Serial
    private static final long serialVersionUID = 0L;
    private ContatosEnumeration tipoContato;
    private String contato;

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

    @Override
    public Object getSerialized() {
        return null;
    }
}
