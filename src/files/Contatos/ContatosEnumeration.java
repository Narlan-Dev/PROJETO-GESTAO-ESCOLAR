package org.gestaoescolar.Contatos;

@SuppressWarnings("unused")
public enum ContatosEnumeration {

    TELEFONE("Telefone"),
    TELEFONE_RESPONSAVEIS("Telefone dos Responsáveis"),
    EMAIL("Email"),
    EMAIL_INSTITUCIONAL("Email Institucional"),
    EMAIL_RESPONSAVEIS("Email dos Responsáveis");

    public final String title;

    ContatosEnumeration(String title){
        this.title = title;
    }
}
