package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // data: properties, attributes, fields
    int size = 0;
    int[] elems = new int[4];

    // interface + implementation

    public void addLast(int n) {
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
