package com.bvan.oop.lessons5_6;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class StaticFactoryMethod {

    public static void main(String[] args) {
        // static factory method
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.of(2018, 10, 15);
        LocalDate ld3 = LocalDate.parse("2018-10-15");
    }
}
