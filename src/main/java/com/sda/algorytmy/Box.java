package com.sda.algorytmy;

public class Box<T> {

    private T element;
    private T[] tablica;

    public Box(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }


}
