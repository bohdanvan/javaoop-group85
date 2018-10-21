package com.bvan.oop.lessons7_8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class IntegerList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        int x = list.get(0);

        System.out.println(x);
    }
}
