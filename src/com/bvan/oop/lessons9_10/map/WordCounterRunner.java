package com.bvan.oop.lessons9_10.map;

/**
 * @author bvanchuhov
 */
public class WordCounterRunner {

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("Java");
        wordCounter.addWord("Kotlin");
        wordCounter.addWord("Java");
        wordCounter.addWord("C#");
        wordCounter.addWord("Kotlin");
        wordCounter.addWord("Java");
        wordCounter.addWord("C#");
        wordCounter.addWord("C#");
        wordCounter.addWord("Java");
        wordCounter.addWord("Kotlin");

        Integer javaCount = wordCounter.getCount("Java");
        System.out.println(javaCount);

        Integer pythonCount = wordCounter.getCount("Python");
        System.out.println(pythonCount);
    }
}
