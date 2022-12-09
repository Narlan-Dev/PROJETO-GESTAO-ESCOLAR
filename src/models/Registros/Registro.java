package models.Registros;

import java.io.Serializable;

/*
* Todas as classes/entidades que devem ser registradas, implementam a interface Registro
* e, por herança implementa Serializable.
* */

@SuppressWarnings("unused")
public interface Registro <T> extends Serializable {
    public T getSerialized();
}
