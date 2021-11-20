package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static <E> List<E> toList(E[] array) {
        return new ArrayList<E>(Arrays.stream(array).toList());
    }
}
