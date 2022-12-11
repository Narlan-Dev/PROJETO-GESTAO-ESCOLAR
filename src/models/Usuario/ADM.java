package models.Usuario;

public class ADM extends Usuario {
    private static String type = "adm";
    public ADM(String name, String matricula, String passoword) {
        super(name, matricula, passoword, type);
    }
}
