package com.bvan.oop.lessons9_10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new HashMap<>();

        phoneBook.put("Taras", new PhoneNumber("+380991111111"));
        phoneBook.put("Petya", new PhoneNumber("+380991111112"));
        phoneBook.put("Masha", new PhoneNumber("+380991111113"));

//        phoneBook.remove("Masha");

        phoneBook.put("Taras", new PhoneNumber("+380991111114"));

        PhoneNumber petyaNumber = phoneBook.get("Taras");
        System.out.println(petyaNumber);

        System.out.println();

        printNames(phoneBook);
        printPhoneNumbers(phoneBook);
        printPhoneBook(phoneBook);
    }

    public static void printPhoneBook(Map<String, PhoneNumber> phoneBook) {
        Set<Map.Entry<String, PhoneNumber>> entries = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber phoneNumber = entry.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
        System.out.println();
    }

    public static void printPhoneNumbers(Map<String, PhoneNumber> phoneBook) {
        Collection<PhoneNumber> phoneNumbers = phoneBook.values();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
        System.out.println();
    }

    public static void printNames(Map<String, PhoneNumber> phoneBook) {
        Set<String> names = phoneBook.keySet();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}

class PhoneNumber {

    private final String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
