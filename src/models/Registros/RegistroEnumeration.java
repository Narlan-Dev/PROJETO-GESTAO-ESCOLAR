/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.Registros;

/**
 *
 * @author Unknown
 */
public enum RegistroEnumeration {
    ALUNOS("data/alunos/"),
    PROFESSORES("data/professores/"),
    TURMAS("data/turmas/");
    
    public String directoryPath;
    RegistroEnumeration(String directoryPath){
        this.directoryPath = directoryPath;
    }
    
}
