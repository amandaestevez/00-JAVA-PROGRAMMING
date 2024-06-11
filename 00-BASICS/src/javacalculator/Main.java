package javacalculator;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    // Create a Scanner object to read user input
    try (
    Scanner scanner = new Scanner(System.in)) {
        // Create instances of all operations (addition, subtraction, multiplication, division)
        Operation addOperation = new AddOperation();
        Operation subtractOperation = new SubtractOperation();
        Operation multiplyOperation = new MultiplyOperation();
        Operation divideOperation = new DivideOperation();

        // Create a Calculator object
        Calculator calculator = new Calculator();

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose the operation (+, -, *, /)
        System.out.print("Enter the operation (+, -, *, /): ");
        String operationChoice = scanner.next();

        // Configure the calculator with the chosen operation
        switch (operationChoice) {
          case "+":
            calculator.setOperation(addOperation);
            break;
          case "-":
            calculator.setOperation(subtractOperation);
            break;
          case "*":
            calculator.setOperation(multiplyOperation);
            break;
          case "/":
            calculator.setOperation(divideOperation);
            break;
          default:
            System.out.println("Invalid operation.");
            return;
        }

        // Perform the operation and display the result
        double result = calculator.performOperation(num1, num2);
        System.out.println("Result: " + result);
    }
  }

}
