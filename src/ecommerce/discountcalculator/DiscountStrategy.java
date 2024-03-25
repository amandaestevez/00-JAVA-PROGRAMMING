package ecommerce.discountcalculator;

/*
 * This Java interface defines the behavior of a discount strategy.
 * It represents the Strategy design pattern.
 */
interface DiscountStrategy {
    double applyDiscount(double total);
}
