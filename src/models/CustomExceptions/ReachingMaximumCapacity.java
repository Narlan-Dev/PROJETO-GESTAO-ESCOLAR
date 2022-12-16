package models.CustomExceptions;

public class ReachingMaximumCapacity extends Exception {
    public static String getMessegen(){
        return "Capacidade maxima atinginda";
    }
    public ReachingMaximumCapacity(){
        super("Capacidade maxima atinginda");
    }
}
