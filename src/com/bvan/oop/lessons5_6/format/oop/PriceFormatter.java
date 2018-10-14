package com.bvan.oop.lessons5_6.format.oop;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public class PriceFormatter implements Formatter {

    @Override
    public String format(Product product) {
        return String.valueOf(product.getPrice());
    }
}
