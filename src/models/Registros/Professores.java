package models.Registros;

import models.Registros.Contatos.Contatos;

public class Professores implements Registro{

    private String nome;
    private String matricula;
    private String cadastroPessoaFisica;
    private Contatos contatos;

    public Professores() {
    }

    public Professores(String nome, String matricula, String cadastroPessoaFisica, Contatos contatos) {
        this.nome = nome;
        this.matricula = matricula;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public void setCadastroPessoaFisica(String cadastroPessoaFisica) {
        this.cadastroPessoaFisica = cadastroPessoaFisica;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    @Override
    public String getIdentificador() {
        return this.cadastroPessoaFisica;
    }
}
