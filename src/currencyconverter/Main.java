package currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please insert the USD value for conversion: ");
            double input = Double.parseDouble(scanner.nextLine());

            OldCurrencyConverter oldConverter = new OldCurrencyConverter();
            CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);

            // Converts from USD to EUR
            double convertedAmount = adapter.convertUSDtoEUR(input);

            // Prints the conversion result
            System.out.println("USD: " + input);
            System.out.println("EUR: " + convertedAmount);
        } catch (NumberFormatException e) {
            System.err.println("Error: the value inserted isn't valid.");
            e.printStackTrace();
        }
    }
}