package com.bvan.oop.lessons7_8.benchmark;

/**
 * @author bvanchuhov
 */
public class StringBuilderExample {

    public static void main(String[] args) {
        String name = "Taras";
        int age = 25;

        String info = "I'm " + name + ", " + age + " years old";
        System.out.println(info);

        StringBuilder sb = new StringBuilder()
                .append("I'm ")
                .append(name)
                .append(", ")
                .append(age)
                .append(" years old");
        System.out.println(sb.toString());
    }
}
