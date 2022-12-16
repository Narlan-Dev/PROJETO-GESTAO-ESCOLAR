package models.Registros;

import models.Registros.Contatos.Contatos;


@SuppressWarnings("unused")
public class Alunos implements Registro{

    private String nomeCompleto;
    private String cadastroPessoaFisica;
    private Endereco endereco;
    private String responsaveis;
    private String email;
    private String telefone;
    private Contatos contatos;
    private Sala sala;
    private String senha;
    private String login;

    public Alunos(){}

    public Alunos(String nomeCompleto,
            String cadastroPessoaFisica,
            Endereco endereco,
            String responsaveis,
            String email,
            String telefone,
            Sala sala){
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.endereco = endereco;
        this.responsaveis = responsaveis;
        this.email = email;
        this.telefone = telefone;
        this.nomeCompleto = nomeCompleto;
        this.sala = sala;
        this.senha = cadastroPessoaFisica;
        this.login = "a" + senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail(){
        return this.email;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    /*public void setSala() {
        this.sala = null;
    }*/

    public Sala getSala() {
        return sala;
    }
    

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
   
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCadastroPessoaFisica() {
        return cadastroPessoaFisica;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getResponsaveis() {
        return responsaveis;
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
        return RegistroEnumeration.ALUNOS.directoryPath;
    }

    @Override
    public String getPathName() {
        return RegistroEnumeration.ALUNOS.directoryPath + this.cadastroPessoaFisica;
    }
    
}