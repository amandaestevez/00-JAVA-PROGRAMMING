package ecommerce.discountcalculator;

/*
 * This code defines a class called TenPercentDiscount that implements the DiscountStrategy interface.
 * The applyDiscount method returns the total price multiplied by 0.9 (the discount percentage).
 */
class TenPercentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        return total * 0.9;
    }
}
