package com.bvan.oop.lessons1_2.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        System.out.println(list);

        ArrayList<Integer> list2 = list;
        list2.add(100);

        System.out.println(list);
    }
}
