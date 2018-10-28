package com.bvan.oop.lessons9_10.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class MapImplementations {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();
        // 1. HashMap - O(1), random order of keys
        // 2. LinkedHashMap - O(1), adding order of keys
        // 3. TreeMap - O(logN), sorted order of keys

        phoneBook.put("Taras", new PhoneNumber("+380991111111"));
        phoneBook.put("Ivan", new PhoneNumber("+380991111114"));
        phoneBook.put("Ira", new PhoneNumber("+380991111115"));
        phoneBook.put("Petya", new PhoneNumber("+380991111112"));
        phoneBook.put("Masha", new PhoneNumber("+380991111113"));

        System.out.println(phoneBook);
    }
}
