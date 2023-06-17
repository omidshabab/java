package practice_six;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5);
        System.out.println("Display: " + calculator.getDisplay()); // Display: 5.0
        
        calculator.multiply(3);
        System.out.println("Display: " + calculator.getDisplay()); // Display: 15.0
        
        calculator.subtract(7);
        System.out.println("Display: " + calculator.getDisplay()); // Display: 8.0
        
        calculator.divide(2);
        System.out.println("Display: " + calculator.getDisplay()); // Display: 4.0
        
        calculator.clearDisplay();
        System.out.println("Display: " + calculator.getDisplay()); // Display: 0
    }

    static public class Calculator {
        private String display;
        private double memory;

        public Calculator() {
            display = "0";
            memory = 0.0;
        }

        public String getDisplay() {
            return display;
        }

        public double getMemory() {
            return memory;
        }

        public void setDisplay(String newDisplay) {
            display = newDisplay;
        }

        public void setMemory(double newMemory) {
            memory = newMemory;
        }

        public void clearDisplay() {
            display = "0";
        }

        public void clearMemory() {
            memory = 0.0;
        }

        public void add(double number) {
            memory += number;
        }

        public void subtract(double number) {
            memory -= number;
        }

        public void multiply(double number) {
            memory *= number;
        }

        public void divide(double number) {
            if (number != 0) {
                memory /= number;
            } else {
                display = "Error: Division by zero";
            }
        }
    }
}
