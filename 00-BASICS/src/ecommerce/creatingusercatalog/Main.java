import java.util.Scanner;

/*
 * This program prompts the user to enter their username & allows them to subscribe or unsubscribe from a catalog. 
 * If they choose to subscribe, they can add a product to the catalog by entering its name, description, and price. 
 * If they choose to unsubscribe, they will no longer receive notifications about new products. 
 * The program then terminates.
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompting for the user's name
            System.out.println("Enter your username:");
            String userName = scanner.nextLine();
            User user = new User(userName);
            Catalog catalog = new Catalog();
            // Subscribing the user to the catalog
            catalog.addObserver(user);

            // Asking for the user's action
            System.out.println(
                    "If you wish to unsubscribe, type 'cancel'. To receive notifications, type any other value.");
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("cancel")) {
                catalog.removeObserver(user);
                System.out.println("You have unsubscribed and will not receive notifications of new products.");
            } else {
                // Requesting product details
                System.out.println("Enter the name of the product to be added:");
                String productName = scanner.nextLine();

                System.out.println("Enter the product description:");
                String productDescription = scanner.nextLine();

                System.out.println("Enter the product price:");
                double productPrice = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character after nextDouble

                // Adding product to the catalog
                catalog.addProduct(productName, productDescription, productPrice);
            }

            System.out.println("Program terminated.");
        }
    }
}
