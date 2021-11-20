package com.company;

public class Ex1Test {
    public static void main(String[] args) {
        Ex1 ex = new Ex1();
        Object[] array = {"abc", "dba", "asf", 10, true};
        System.out.println("Array: " + ex.toList(array));
    }
}
