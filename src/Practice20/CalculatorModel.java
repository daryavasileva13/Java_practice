package Practice20;
import java.util.Stack;


public class CalculatorModel {
    private Stack<Double> stack;

    public CalculatorModel() {
        stack = new Stack<>();
    }

    public void pushOperand(double operand) {
        stack.push(operand);
    }

    public void performOperation(String operator) {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = performOperation(operator, operand1, operand2);
        stack.push(result);
    }

    public double getResult() {
        return stack.pop();
    }

    private double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

