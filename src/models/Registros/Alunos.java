package models.Registros;

import models.Contatos.Contatos;


@SuppressWarnings("unused")
public class Alunos implements Registro{

    private String nomeCompleto;
    private String cadastroPessoaFisica;
    private Contatos contatos;

    public Alunos(){}

    public Alunos(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public Alunos(String nome, String cadastroPessoaFisica){
        this.nomeCompleto = nome;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

    public void parseContatos(Contatos contatos){
        this.contatos = contatos;
    }

    public Contatos getContatos(){
        return this.contatos;
    }

    @Override
    public Object getSerialized() {
        return null;
    }
}
