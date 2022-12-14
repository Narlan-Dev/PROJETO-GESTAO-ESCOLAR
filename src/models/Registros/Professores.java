package models.Registros;

import controllers.Usuarios.Serializer;
import models.Registros.Contatos.Contatos;

import java.io.File;
import models.Registros.Contatos.Contato;
import models.Registros.Contatos.ContatosEnumeration;

@SuppressWarnings("unused")
public class Professores implements Registro<Professores>{

    private String nome;
    private String senha;
    private String cadastroPessoaFisica;
    private String endereco;
    private Contatos contatos;
    
    public Professores() {
    }

    public Professores(String nome, String senha, String cadastroPessoaFisica, Contatos contatos) {
        this.nome = nome;
        this.senha = senha;
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.contatos = contatos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
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
        return "data/professores/" + this.cadastroPessoaFisica;
    }
    
}
