package com.bvan.oop.lessons5_6.abstractclass;

/**
 * @author bvanchuhov
 */
public class AbstractClassExample {
    public static void main(String[] args) {
        Student student = new ExcellentStudent("Ivan", "KPI");
        student.study();
    }
}

abstract class Student {

    private final String name;
    private final String university;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public void sayHello() {
        System.out.println("I'm student " + name);
    }

    public abstract void study();
}

class ExcellentStudent extends Student {

    public ExcellentStudent(String name, String university) {
        super(name, university);
    }

    @Override
    public void study() {
        System.out.println("Study hard");
    }
}
