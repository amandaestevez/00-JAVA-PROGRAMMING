package financialsector.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Por favor, insira o valor em USD para conversão: ");
            double input = Double.parseDouble(scanner.nextLine());

            OldCurrencyConverter oldConverter = new OldCurrencyConverter();
            CurrencyAdapter adapter = new CurrencyAdapter(oldConverter);

            // Chamar o método para converter USD para EUR
            double convertedAmount = adapter.convertUSDtoEUR(input);

            // Imprimir o resultado da conversão
            System.out.println("USD: " + input);
            System.out.println("EUR: " + convertedAmount);
        } catch (NumberFormatException e) {
            System.err.println("Erro: O valor inserido não é um número válido.");
            e.printStackTrace();
        }
    }
}