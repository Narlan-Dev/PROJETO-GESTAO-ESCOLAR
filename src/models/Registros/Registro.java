package models.Registros;
import java.io.Serializable;

@SuppressWarnings("unused")
public interface Registro extends Serializable {
    public String getIdentificador();
    public String getPath();
    public String getPathName();
}
