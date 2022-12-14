/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Registros;

import java.io.Serializable;

/**
 *
 * @author Unknown
 */
public class Endereco implements Serializable {
    
    private String UF;
    private String CEP;
    private String CIDADE;
    private String RUA;
    private String NUMERO;
    private String BAIRRO;
    private String COMPLEMENTO;

    public Endereco(String UF, String CEP, String CIDADE, String RUA, String NUMERO, String BAIRRO, String COMPLEMENTO) {
        this.UF = UF;
        this.CEP = CEP;
        this.CIDADE = CIDADE;
        this.RUA = RUA;
        this.NUMERO = NUMERO;
        this.BAIRRO = BAIRRO;
        this.COMPLEMENTO = COMPLEMENTO;
    }

    public Endereco() {}

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCIDADE() {
        return CIDADE;
    }

    public void setCIDADE(String CIDADE) {
        this.CIDADE = CIDADE;
    }

    public String getRUA() {
        return RUA;
    }

    public void setRUA(String RUA) {
        this.RUA = RUA;
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public void setNUMERO(String NUMERO) {
        this.NUMERO = NUMERO;
    }

    public String getBAIRRO() {
        return BAIRRO;
    }

    public void setBAIRRO(String BAIRRO) {
        this.BAIRRO = BAIRRO;
    }

    public String getCOMPLEMENTO() {
        return COMPLEMENTO;
    }

    public void setCOMPLEMENTO(String COMPLEMENTO) {
        this.COMPLEMENTO = COMPLEMENTO;
    }
    
    
    
}