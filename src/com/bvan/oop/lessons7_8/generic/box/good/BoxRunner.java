package com.bvan.oop.lessons7_8.generic.box.good;

import com.bvan.oop.lessons7_8.generic.box.Cat;
import com.bvan.oop.lessons7_8.generic.box.Dog;
import com.bvan.oop.lessons7_8.generic.box.Kitty;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class BoxRunner { // Type-safe code

    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>(new Cat());
        Box<Kitty> kittyBox = new Box<>(new Kitty());
        Box<Dog> dogBox = new Box<>(new Dog());
        Box<String> namesBox;
        Box<Box<Cat>> boxWithCatBox;
        Box<List<Box<Cat>>> strangeBox;

        sendBox(catBox);
    }

    private static void sendBox(Box<Cat> catBox) {
        Cat cat = catBox.get();
        cat.meow();
    }
}
