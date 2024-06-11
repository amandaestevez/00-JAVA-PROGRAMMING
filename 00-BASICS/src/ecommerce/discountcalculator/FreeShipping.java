package ecommerce.discountcalculator;

/*
 * This code snippet defines a class called FreeShipping that implements the DiscountStrategy interface. 
 * It provides an implementation of the applyDiscount method that prints a message indicating that the free shipping discount has been applied.
 */
class FreeShipping implements DiscountStrategy {
    @Override
    public double applyDiscount(double total) {
        System.out.println("Free shipping applied!");
        return total;
    }
}
