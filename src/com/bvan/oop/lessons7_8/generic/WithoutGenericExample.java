package com.bvan.oop.lessons7_8.generic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class WithoutGenericExample { // Java 5, 2004

    public static void main(String[] args) {
        List names = new ArrayList();

        names.add("Taras");
        names.add("Masha");
        names.add(10);
        names.add(LocalDate.now());

        String s = (String) names.get(0);
        System.out.println(s);

        System.out.println(names);
    }
}
