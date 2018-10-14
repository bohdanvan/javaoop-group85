package com.bvan.oop.lessons5_6.format.proc;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class ProcCartRunner {

    public static void main(String[] args) {
        ProcCart cart = new ProcCart();
        cart.addProduct(new Product("MacBook", 2000));
        cart.addProduct(new Product("Lenovo", 1500));
        cart.addProduct(new Product("Asus", 1700));

        cart.print("price");
    }
}
