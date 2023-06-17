package practice_six;

public class Main {

    static public class Calculator {
    private double result;

    public Calculator() {
        result = 0;
    }

    public double add(double operand1, double operand2) {
        result = operand1 + operand2;
        return result;
    }

    public double subtract(double operand1, double operand2) {
        result = operand1 - operand2;
        return result;
    }

    public double multiply(double operand1, double operand2) {
        result = operand1 * operand2;
        return result;
    }

    public double divide(double operand1, double operand2) {
        if (operand2 != 0) {
            result = operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero!");
        }
        return result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        double difference = calculator.subtract(7, 2);
        System.out.println("Difference: " + difference);

        double product = calculator.multiply(4, 6);
        System.out.println("Product: " + product);

        double quotient = calculator.divide(10, 2);
        System.out.println("Quotient: " + quotient);
    }
}
