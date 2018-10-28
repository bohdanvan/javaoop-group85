package com.bvan.oop.lessons9_10.map;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class ProcWordsCounter {

    public static void main(String[] args) {
        List<String> langs = createLangs();
        Map<String, Integer> wordToCount = new TreeMap<>(countWords(langs));
        System.out.println(wordToCount);
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }

    public static List<String> createLangs() {
        return Arrays.asList(
                "JavaScript",
                "Kotlin",
                "Java",
                "Java",
                "C#",
                "Kotlin",
                "Kotlin",
                "JavaScript",
                "Java",
                "JavaScript",
                "JavaScript",
                "Python",
                "Java",
                "Kotlin",
                "C#",
                "C#",
                "Python",
                "Python",
                "Kotlin",
                "Kotlin"
        );
    }
}
