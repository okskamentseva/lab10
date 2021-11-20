package com.company;

public class Ex3Test {
    public static void main(String[] args) {
        Ex3<Integer> ex = new Ex3<Integer>(5);
        ex.add(123);
        ex.add(543);
        ex.add(948);
        ex.add(289);
        ex.add(178);

        System.out.println(ex.getByIndex(3));
        System.out.println(ex.getByIndex(10));
    }
}