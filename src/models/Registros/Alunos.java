package models.Registros;

import models.Coordenador.Sala;
import models.Registros.Contatos.Contatos;


@SuppressWarnings("unused")
public class Alunos implements Registro{

    private String nomeCompleto;
    private String cadastroPessoaFisica;
    private Endereco endereco;
    private String responsaveis;
    private Contatos contatos;
    private Sala sala;
    private String senha;
    private String login;

    public Alunos(){}

    public Alunos(String nomeCompleto,
            String cadastroPessoaFisica,
            Endereco endereco,
            String responsaveis,
            Contatos contatos,
            Sala sala){
        this.cadastroPessoaFisica = cadastroPessoaFisica;
        this.endereco = endereco;
        this.contatos = contatos;
        this.responsaveis = responsaveis;
        this.nomeCompleto = nomeCompleto;
        this.sala = sala;
        this.senha = cadastroPessoaFisica;
        this.login = "a" + senha;
    }

    public String getSenha() {
        return senha;
    }

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

    public void setContatos(Contatos contatos){
        this.contatos = contatos;
    }

    public Contatos getContatos(){
        return this.contatos;
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