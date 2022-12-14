/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.Usuarios;

import java.io.*;
import models.Registros.Alunos;
import models.Registros.Contatos.Contato;
import models.Registros.Contatos.Contatos;
import models.Registros.Contatos.ContatosEnumeration;
import models.Registros.Registro;

public class Serializer <T extends Registro> {
    public boolean serializeObject(T objeto){
        try {
            System.out.println("ok");
            FileOutputStream fos = new FileOutputStream("asaa");
            System.out.println("ok");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            System.out.println("ok");
            oos.writeObject(objeto);
            System.out.println("ok");
            oos.close();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}