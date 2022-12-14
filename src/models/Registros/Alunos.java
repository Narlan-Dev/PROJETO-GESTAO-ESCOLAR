package models.Registros;

import models.Registros.Contatos.Contatos;


@SuppressWarnings("unused")
public class Alunos implements Registro<Alunos>{

    private String nomeCompleto;
    private String cadastroPessoaFisica;
    private String endereco;
    private Contatos contatos;

    public Alunos(){}

    public Alunos(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public Alunos(String nome, String cadastroPessoaFisica){
        this.nomeCompleto = nome;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

    public void setContatos(Contatos contatos){
        this.contatos = contatos;
    }

    public Contatos getContatos(){
        return this.contatos;
    }

    public Object getSerialized() {
        return null;
    }

    @Override
    public String getIdentificador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPath() {
        return "data/alunos/" + this.cadastroPessoaFisica;
    }
}