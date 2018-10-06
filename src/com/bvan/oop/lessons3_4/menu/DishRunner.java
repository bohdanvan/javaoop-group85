package com.bvan.oop.lessons3_4.menu;

/**
 * @author bvanchuhov
 */
public class DishRunner {

    public static void main(String[] args) {
        Dish ceaser = new Dish("Ceasar", "The popular salad", 120);
        Dish olivie = new Dish("Olivie", "The New Year Dish", 100);

        Menu salads = new Menu("Salads");
        salads.addDish(ceaser);
        salads.addDish(olivie);

        Dish cheapestDish = salads.getCheapestDish();
        System.out.println(cheapestDish);
    }
}

// Dish{name='Olivie', description='The New Year Dish', price=100}
