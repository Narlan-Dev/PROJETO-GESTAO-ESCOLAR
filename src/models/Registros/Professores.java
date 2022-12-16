package models.Registros;

import models.Registros.Contatos.Contatos;

import java.io.File;

@SuppressWarnings("unused")
public class Professores implements Registro{
    
    private String nome;
    private String senha;
    private String cadastroPessoaFisica;
    private Endereco endereco;
    private Contatos contatos;
    private String login;
    private Sala sala;
    private String disciplina;
    
    public Professores() {
    }

    public Professores(String nome,
            String senha,
            String cadastroPessoaFisica,
            Contatos contatos,
            Endereco endereco,
            Sala sala,
            String disciplina) {
        this.sala = sala;
        this.disciplina = disciplina;
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.contatos = contatos;
        this.login = "a" + cadastroPessoaFisica;
    }

    public Sala getSala() {
        return sala;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public String getLogin() {
        return login;
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

    public static void main(String[] args) {
        File userDir = new File(System.getProperty("user.home"));
        System.out.println(userDir);
    }

    @Override
    public String getPath() {
        return RegistroEnumeration.PROFESSORES.directoryPath;
    }

    @Override
    public String getPathName() {
        return RegistroEnumeration.PROFESSORES.directoryPath + this.cadastroPessoaFisica;
    }
    
}
