/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.CustomExceptions;

/**
 *
 * @author Unknown
 */
public class FileExistsException extends RuntimeException{
    public FileExistsException(){
        super("Arquivo já existe");
    }
}
