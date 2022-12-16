package models.CustomExceptions;

public class EmptySelection extends Exception {
    public static String getMessegen(){
        return "Selecione uma disciplina!";
    }
    public EmptySelection(){
        super("Selecione uma disciplina!");
    }
}
