package com.sda.algorytmy;


import java.util.Arrays;

public class ListImpl<E> implements MyList<E> {

    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elementData[];

    public ListImpl(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        if(size == elementData.length) {
            ensureCapacity();
        }
        elementData[size++] = e;
        return false;
    }

    @Override
    public boolean remove(int index) {
        for(int i = index; i < elementData.length - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[elementData.length - 1] = null;
        return true;
    }


    public void ensureCapacity() {
        int newSize = this.elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);

    }
}
