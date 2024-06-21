package javacalculator;

//In this case, the operation isn't supposed to have a "divided by zero" treatment
public class DivideOperation implements Operation {
     @Override
    public double execute(double num1, double num2) {
        return num1 / num2;
    }
}
