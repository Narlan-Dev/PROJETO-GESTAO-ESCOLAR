package models.CustomExceptions;

public class EmptyCamp extends Exception {
    public static String getMessegen(){
        return "Campo Obrigatório!";
    }
    public EmptyCamp(){
        super("Campo Obrigatório!");
    }
}
