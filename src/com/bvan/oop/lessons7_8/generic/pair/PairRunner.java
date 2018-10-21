package com.bvan.oop.lessons7_8.generic.pair;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> nameAndAge = new Pair<>("Taras", 30);
        Pair<String, String> nameAndSurname;
        Pair<Pair<String, Double>, List<String>> pair;
    }
}
