package ecommerce.discountcalculator;

import java.util.ArrayList;
import java.util.List;

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