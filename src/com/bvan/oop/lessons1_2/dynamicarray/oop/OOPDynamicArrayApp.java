package com.bvan.oop.lessons1_2.dynamicarray.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayApp {

    public static void main(String[] args) {
        DynamicArray elems = readElemsFromConsole();
        System.out.println(elems.toString());
    }

    public static DynamicArray readElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        DynamicArray elems = new DynamicArray();

        int n = readElem(scanner);
        while (n != 0) {
            elems.addLast(n);

            n = readElem(scanner);
        }
        return elems;
    }

    public static int readElem(Scanner scanner) {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal number");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
