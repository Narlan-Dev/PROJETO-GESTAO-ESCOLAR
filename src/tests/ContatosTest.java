package tests;

import models.Contatos.Contato;
import models.Contatos.Contatos;
import models.Contatos.ContatosEnumeration;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContatosTest {

    @Test
    public void addContato() {
        Contatos contato = new Contatos();
        Contato tel = new Contato(
                ContatosEnumeration.TELEFONE,
                "123456"
        );
        contato.addContato(tel);
        assertEquals(contato.hashCode(), contato.getContatos());
    }

    @Test
    public void addContatos() {
    }

    @Test
    public void deleteContatoByKey() {
    }

    @Test
    public void getContatos() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void testDelete() {
    }
}