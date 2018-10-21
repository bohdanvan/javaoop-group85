package com.bvan.oop.lessons7_8.object;

import com.bvan.oop.lessons1_2.post.Post;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        A a = new A(10, "aaa");
        A b = new A(10, "aaa");

        boolean equals = a.equals(b); // true
        System.out.println(equals);

        Object o1 = "Hello";
        Object o2 = LocalDate.now();
        Object o3 = new Post("...", "...", 10);
    }
}

class A {

    private final int x;
    private final String y;

    public A(int x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof A)) return false;
        A a = (A) o;
        return x == a.x &&
                Objects.equals(y, a.y);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}
