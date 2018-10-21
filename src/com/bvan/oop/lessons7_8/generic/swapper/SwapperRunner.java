package com.bvan.oop.lessons7_8.generic.swapper;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SwapperRunner {

    public static void main(String[] args) {
        String[] people = {
                "John",
                "Bob",
        };

        Swapper.swapGenerics(people, 0, 1);
        System.out.println(Arrays.toString(people));
    }
}
