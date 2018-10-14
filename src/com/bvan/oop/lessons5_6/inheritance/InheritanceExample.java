package com.bvan.oop.lessons5_6.inheritance;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {
    public static void main(String[] args) {
        Person p1 = new Person("Taras", LocalDate.of(1980, 5, 10));
        Person p2 = new Person();

        p1.sayHello();
        p2.sayHello();

        Developer d1 = new Developer("Ivan", LocalDate.of(1990, 10, 4), "Google");
        d1.sayHello();
        d1.writeCode();

        Person p3 = new Developer("Masha", LocalDate.of(1985, 4, 13), "Amazon");
        p3.sayHello();
    }
}

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
        this("Unnamed", null);
    }

    public void sayHello() {
        System.out.println("I'm " + getName());
    }

    protected String getName() {
        return name;
    }

    private final void foo() {}
}

class Developer extends Person {

    private final String company;

    public Developer(String name, LocalDate birthDate, String company) {
        super(name, birthDate);
        this.company = company;
    }

    public Developer() {
//        this("Unnamed Dev", null, null);
        super("Unnamed Dev", null);
        this.company = null;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        System.out.println("I'm " + getName() + ", developer from " + company);
        super.sayHello();
    }

    private void foo() {}
}
