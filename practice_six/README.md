# Calculator Class

This repository contains a Java program that implements a Calculator class for modeling a basic calculator.

## Problem Description

The goal of this program is to design a class that represents a calculator and provides methods for performing basic arithmetic operations. The Calculator class should have the following features:

- Addition: Perform the addition of two numbers.
- Subtraction: Perform the subtraction of two numbers.
- Multiplication: Perform the multiplication of two numbers.
- Division: Perform the division of two numbers. Handle division by zero error.

## Getting Started

To use the Calculator class, follow these steps:

1. Clone the repository or download the source code files.
2. Import the project into your Java IDE.
3. Create an instance of the Calculator class.
4. Use the available methods to perform arithmetic operations.

## Usage Example

```java
Calculator calculator = new Calculator();

double sum = calculator.add(5, 3);
System.out.println("Sum: " + sum);

double difference = calculator.subtract(7, 2);
System.out.println("Difference: " + difference);

double product = calculator.multiply(4, 6);
System.out.println("Product: " + product);

double quotient = calculator.divide(10, 2);
System.out.println("Quotient: " + quotient);
```

The above example demonstrates how to create an instance of the Calculator class and perform arithmetic operations using its methods.