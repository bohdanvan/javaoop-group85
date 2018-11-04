package com.bvan.oop.lessons11_12.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class NamesIO {

    public static void main(String[] args) {
        String file = "files/names.txt";

        // Java 7: try-with-resources
        try  (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
