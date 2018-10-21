package com.bvan.oop.lessons7_8.generic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample { // Java 5, 2004

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Taras");
        names.add("Masha");
//        names.add(10);
//        names.add(LocalDate.now());

        System.out.println(names);

//        Object[] array1 = names.toArray();
//        String[] array2 = names.toArray(new String[0]);
    }
}
