package com.bvan.oop.lessons1_2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring2 {

    public static void main(String[] args) {
        int[] a = {10, 10, 10};
        int[] b = {20, 20, 20};
        int[] c = a;
        a = b;

        System.out.println("a = " + Arrays.toString(a)); // [20, 20, 20]
        System.out.println("b = " + Arrays.toString(b)); // [20, 20, 20]
        System.out.println("c = " + Arrays.toString(c)); // [10, 10, 10]
    }
}
