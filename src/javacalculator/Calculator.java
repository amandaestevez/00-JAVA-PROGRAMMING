package javacalculator;

class Calculator {
    private Operation operation;
    
    public void setOperation(Operation operation) {
        this.operation = operation;
  }

  public double performOperation(double num1, double num2) {
    // Delegate the operation execution to the chosen operation object
    return operation.execute(num1, num2);
  }
}
