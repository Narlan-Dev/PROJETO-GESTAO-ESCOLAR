package controllers;
import models.Usuario.Usuario;

public interface Controller<T> {
    public void add(T elemnt);
    public void update(T element, String text, String txt);
    public void delete(T element);
}
