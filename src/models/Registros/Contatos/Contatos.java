package models.Registros.Contatos;

import models.CustomExceptions.ContatoNotFoundException;
import models.Registros.Registro;

import java.io.Serializable;
import java.util.HashSet;

@SuppressWarnings("unused")
public class Contatos implements Registro {

    private HashSet<Contato> contatos;

    public Contatos(){}

    public void addContato(Contato contato){
        if (this.contatos == null){
            this.contatos = new HashSet<>();
            this.contatos.add(contato);
        } else {
            this.contatos.add(contato);
        }
    }

    public void addContatos(HashSet<Contato> contatos){
        if (this.contatos == null){
            this.contatos = new HashSet<>();
            this.contatos.addAll(contatos);
        } else {
            this.contatos.addAll(contatos);
        }
    }

    public void deleteContato(Contato contato)
            throws ContatoNotFoundException {
        this.contatos.remove(contato);
    }

    public HashSet<Contato> getContatos() {
        return this.contatos;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        for (Contato contato : this.contatos){
            text.append(contato.toString());
        }
        return text.toString();
    }

    public void delete(Contato contato) {
        this.contatos.remove(contato);
    }

    public void delete(){
        for (Contato contato : this.contatos){
            this.delete(contato);
        }
    }

    @Override
    public Object getSerialized() {
        return null;
    }
}
