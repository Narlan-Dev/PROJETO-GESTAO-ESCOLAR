package controllers.Salas;
import controllers.Controller;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import models.Coordenador.Sala;

public abstract class ControllerSalas implements Controller {
    private static final Map<Object, Icon> icons = new HashMap<Object, Icon>();

    public static void add(Sala sala){
        icons.put(sala.getName(), sala.getIcon());
    }
    public static Map<Object, Icon> getMap(){
        return icons;
    }
}
