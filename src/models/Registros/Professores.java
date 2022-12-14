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
    
    public Professores() {
    }

    public Professores(String nome,
            String senha,
            String cadastroPessoaFisica,
            Contatos contatos,
            Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.contatos = contatos;
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
