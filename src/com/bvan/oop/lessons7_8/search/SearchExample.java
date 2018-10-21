package com.bvan.oop.lessons7_8.search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SearchExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30, 20, 10, 5, 15, 20);

        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(20));
        System.out.println(list.lastIndexOf(40));

        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 30));
    }
}
