package ecommerce.discountcalculator;

import java.util.ArrayList;
import java.util.List;

/*
 * This code defines a ShoppingCart class in Java.
 * It has a list of products and a DiscountStrategy object. 
 * The addProduct method adds a product to the cart.
 * The setDiscountStrategy method sets the discount strategy for the cart.
 * The calculateTotal method calculates the total cost of the cart, applying the seltected discount strategy.
 */
class ShoppingCart {
    private List<Double> products = new ArrayList<>();
    private DiscountStrategy discountStrategy;

    public void addProduct(double price) {
        products.add(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (double price : products) {
            total += price;
        }
        return discountStrategy.applyDiscount(total);
    }
}