package com.company;

public class Ex3<E> {
    private E[] array;
    private int size = 0;

    public Ex3(int size) {
        array = (E[]) new Object[size];
    }

    public void add(E elem) {
        if (size < array.length) {
            array[size] = elem;
            size++;
        }
    }

    public E getByIndex(int i) {
        if (i > 0 & i < size) {
            return array[i];
        }
        return null;
    }
}