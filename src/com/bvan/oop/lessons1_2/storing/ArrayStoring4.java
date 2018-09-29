package com.bvan.oop.lessons1_2.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring4 {

    public static void main(String[] args) {
        int[] a = {10, 10, 10};
        changeArray(a);
        System.out.println("a = " + Arrays.toString(a));
    }

    public static void changeArray(int[] b) {
        b = new int[] {20, 20, 20};
    }
}
