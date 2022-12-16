package models.CustomExceptions;

public class ContaInvalida extends Exception {
    public static String getMessegen(){
        return "Conta inválida";
    }
    public ContaInvalida(){
        super("Conta inválida");
    }
}
