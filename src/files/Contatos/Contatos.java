package files.Contatos;

import files.CustomExceptions.ContatoNotFoundException;

import java.util.HashSet;

@SuppressWarnings("unused")
public class Contatos {

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

    public void deleteContatoByKey(ContatosEnumeration tipoContato)
            throws ContatoNotFoundException {
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

    public void delete(HashSet<Contato> contatos){
        this.contatos.removeAll(contatos);
    }

}
