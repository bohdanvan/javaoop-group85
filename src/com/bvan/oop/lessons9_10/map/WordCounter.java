package com.bvan.oop.lessons9_10.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author bvanchuhov
 */
public class WordCounter {

    private final Map<String, Integer> wordToCount = new LinkedHashMap<>();

    public void addWord(String word) {
        if (wordToCount.containsKey(word)) {
            Integer count = wordToCount.get(word);
            wordToCount.put(word, count + 1);
        } else {
            wordToCount.put(word, 1);
        }
    }

    public Integer getCount(String word) {
        return wordToCount.get(word);
    }
}
