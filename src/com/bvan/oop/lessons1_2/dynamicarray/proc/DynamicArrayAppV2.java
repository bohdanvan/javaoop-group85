package com.bvan.oop.lessons1_2.dynamicarray.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DynamicArrayAppV2 {

    public static void main(String[] args) {
        int[] elems = readElemsFromConsole();

        System.out.println(Arrays.toString(elems));
        System.out.println("sum = " + sum(elems));
    }

    public static int sum(int[] array) {
        int sum = 0;
        // iter + Tab
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }

    public static int[] readElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int size = 0;
        int[] elems = new int[4];

        int n = readElem(scanner);
        while (n != 0) {
            if (size == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[size] = n;
            size++;

            n = readElem(scanner);
        }
        return Arrays.copyOf(elems, size);
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
