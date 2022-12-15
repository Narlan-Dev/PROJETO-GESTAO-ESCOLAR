package controllers;

public interface Controller<T> {
    public void add(T elemnt);
    public void update(T element, String text, String txt);
    public void delete(T element);
}
