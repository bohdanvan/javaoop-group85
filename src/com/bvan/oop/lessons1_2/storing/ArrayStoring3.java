package com.bvan.oop.lessons1_2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring3 {

    public static void main(String[] args) {
        int[] a = {10, 10, 10};
        changeArray(a);
        System.out.println("a = " + Arrays.toString(a));

//        Arrays.fill(a, 1);
//        Arrays.sort(a);
    }

    public static void changeArray(int[] b) {
        b[0] = 20;
    }
}
