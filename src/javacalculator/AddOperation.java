package javacalculator;

public class AddOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
      return num1 + num2;
    }
}
