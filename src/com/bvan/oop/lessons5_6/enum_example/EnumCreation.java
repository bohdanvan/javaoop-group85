package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class EnumCreation {

    public static void main(String[] args) {
//        Genre g = new Genre();
        Genre g1 = Genre.ACTION;

        // String -> enum
        Genre g2 = Genre.valueOf("Horror".toUpperCase());

        // int -> enum
        Genre[] values = Genre.values();
        Genre g3 = values[3];
        System.out.println("g3 = " + g3);

        // enum -> String
        String name = g2.name();

        // enum -> int
        int ordinal = g3.ordinal();

        System.out.println(g1.getShortName());
        System.out.println(Genre.HORROR.getShortName());

        System.out.println(Genre.HORROR == Genre.valueOf("HORROR"));
    }
}
