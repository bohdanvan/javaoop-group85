package com.bvan.oop.lessons1_2.dynamicarray.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da1 = new DynamicArray();
        da1.addLast(10);
        da1.addLast(20);
        System.out.println(da1.toString()); // [10, 20]

        DynamicArray da2 = new DynamicArray();
        System.out.println(da2.toString()); // []

        DynamicArray da3 = new DynamicArray();
        da3.addLast(10);
        da3.addLast(20);
        da3.addLast(30);
        da3.addLast(40);
        da3.addLast(50);
        da3.addLast(60);
        System.out.println(da3.toString()); // [10, 20, 30, 40, 50, 60]
    }
}
