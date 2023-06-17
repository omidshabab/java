# Salary Calculation

This program calculates the salary of an employee based on the number of working hours and the hourly wage. It then deducts a 10% tax from the salary and displays both the salary before tax deduction and the salary after tax deduction.

## Problem Statement

You are required to write a program that performs the following steps:

1. Prompt the user to enter the number of working hours.
2. Prompt the user to enter the hourly wage.
3. Calculate the salary before tax deduction using the formula: `salaryBeforeTax = workingHours * hourlyWage`.
4. Deduct a 10% tax from the salary using the formula: `tax = salaryBeforeTax * 0.1`.
5. Calculate the salary after tax deduction using the formula: `salaryAfterTax = salaryBeforeTax - tax`.
6. Display the salary before tax deduction and the salary after tax deduction on the screen.

## Usage

1. Compile the Java program using a Java compiler: `javac CalculateSalary.java`.
2. Run the compiled program: `java CalculateSalary`.
3. Enter the number of working hours when prompted.
4. Enter the hourly wage when prompted.
5. The program will display the salary before tax deduction and the salary after tax deduction on the screen.

## Example

```
Enter the number of working hours: 40
Enter the hourly wage: 20

Salary before tax deduction: 800.0
Salary after tax deduction: 720.0
```

## Code

```java
import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of working hours: ");
        int workingHours = input.nextInt();

        System.out.print("Enter the hourly wage: ");
        double hourlyWage = input.nextDouble();

        double salaryBeforeTax = workingHours * hourlyWage;
        double tax = salaryBeforeTax * 0.1;
        double salaryAfterTax = salaryBeforeTax - tax;

        System.out.println("Salary before tax deduction: " + salaryBeforeTax);
        System.out.println("Salary after tax deduction: " + salaryAfterTax);
    }
}
```
