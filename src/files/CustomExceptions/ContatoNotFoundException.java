package org.gestaoescolar.CustomExceptions;

import org.gestaoescolar.Contatos.ContatosEnumeration;

@SuppressWarnings("unused")
public class ContatoNotFoundException extends RuntimeException{

    public ContatoNotFoundException(ContatosEnumeration contatosEnum){
        super("Não há contatos registrados do tipo: " + contatosEnum.name());
    }

    public ContatoNotFoundException(String value){
        super("Não há contatos registrados com o valor informado: " + value);
    }

}
