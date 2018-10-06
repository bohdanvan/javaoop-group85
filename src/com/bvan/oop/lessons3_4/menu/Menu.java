package com.bvan.oop.lessons3_4.menu;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class Menu {

    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        if (dishes.isEmpty()) {
            throw new IllegalStateException("can't find cheapest dish in the empty menu");
        }
        Dish cheapestDish = dishes.get(0);
        for (Dish dish : dishes) {
            if (cheapestDish.getPrice() > dish.getPrice()) {
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
