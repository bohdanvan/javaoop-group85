package com.bvan.oop.lessons9_10.equalshashcode;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCodeExample {

    public static void main(String[] args) {
        A a = new A(10);
        A b = new A(10);
        A c = new A(20);

        System.out.println("Equals:");
        System.out.println(a.equals(a)); // true
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true
        System.out.println(a.equals(c)); // false
        System.out.println();

        System.out.println("Hash code:");
        System.out.println(a.hashCode() == a.hashCode()); // true
        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.hashCode() == c.hashCode()); // false, but can be true (collision)
        System.out.println();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
    }
}

class A {

    private final int x;
    private final String y = "Hello";

    public A(int x) {
        this.x = x;
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
}
