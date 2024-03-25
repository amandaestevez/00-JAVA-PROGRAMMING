package ecommerce.discountcalculator;

import java.util.Scanner;

/*
 * This code snippet is a Java program that calculates the total cost of a product based on user input. 
 * It prompts the user to enter the product name and price, adds the product to a shopping cart,
 *  and then allows the user to choose a discount strategy. 
 * The program uses a Scanner to read user input from the console.
 * The chosen discount strategy is then applied to the shopping cart,
 *  and the total cost is calculated and displayed to the user.
 */
public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Product Input
      System.out.println("Enter product name: ");
      String productName = scanner.nextLine();

      System.out.println("Enter product price: ");
      double productPrice = scanner.nextDouble();
      
      // Add product to cart
      ShoppingCart cart = new ShoppingCart();
      cart.addProduct(productPrice);

      // Discount Strategy Choice
      System.out.println("Choose a discount strategy:");
      System.out.println("1. 10% Discount");
      System.out.println("2. Free Shipping");
      System.out.print("Enter your choice: ");
      int strategyChoice = scanner.nextInt();

      // Configure strategy based on choice
      switch (strategyChoice) {
        case 1:
          cart.setDiscountStrategy(new TenPercentDiscount());
          break;
        case 2:
          cart.setDiscountStrategy(new FreeShipping());
          break;
        default:
          System.out.println("Invalid choice. No discount applied.");
      }

      double total = cart.calculateTotal();
      System.out.printf("Total cost for %s: R$ %.1f\n", productName, total);
    }
  }
}
