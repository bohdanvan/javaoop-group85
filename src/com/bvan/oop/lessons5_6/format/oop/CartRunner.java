package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class CartRunner {

    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("MacBook", 2000));
        cart.addProduct(new Product("Lenovo", 1500));
        cart.addProduct(new Product("Asus", 1700));

        // anonymous class
        Formatter formatter = nameFormatter();
        cart.print(formatter);
    }

    // static factory method
    public static Formatter simpleFormatter() {
        return new Formatter() {
            @Override
            public String format(Product product) {
                return product.getName().charAt(0) + " : "
                        + product.getPrice();
            }
        };
    }

    public static Formatter nameFormatter() {
        return new NameFormatter();
    }
}
