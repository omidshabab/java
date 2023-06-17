# Land Price Calculator

This program calculates the total price of a rectangular land based on its length, width, and price per square meter.

## Usage

1. Run the program.
2. Enter the length of the land in meters when prompted.
3. Enter the width of the land in meters when prompted.
4. Enter the price per square meter of the land when prompted.
5. The program will calculate the total price of the land and display it.

## Problem

You need to write a program that reads the length and width of a rectangular land, along with the price per square meter of the land, from the user. The program should then calculate the total price of the land and display it.

## Solution

The program uses the following steps to calculate the total price of the land:

1. Prompt the user to enter the length of the land.
2. Prompt the user to enter the width of the land.
3. Prompt the user to enter the price per square meter of the land.
4. Calculate the area of the land by multiplying the length and width.
5. Calculate the total price by multiplying the area with the price per square meter.
6. Display the total price of the land.

The program is implemented in Java using the `Scanner` class to read input from the user. The `calculateTotalPrice` method is used to perform the actual calculation of the total price.

```java
package practice_three;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the length of the land (in meters): ");
        double length = in.nextDouble();

        System.out.print("Enter the width of the land (in meters): ");
        double width = in.nextDouble();

        System.out.print("Enter the price per square meter of the land: ");
        double pricePerSquareMeter = in.nextDouble();

        double totalPrice = calculateTotalPrice(length, width, pricePerSquareMeter);

        System.out.println("The total price of the land is: " + totalPrice + " units");
    }

    public static double calculateTotalPrice(double length, double width, double pricePerSquareMeter) {
        double area = length * width;
        double totalPrice = area * pricePerSquareMeter;
        return totalPrice;
    }
}
```

Now you can easily calculate the total price of a land by providing its length, width, and price per square meter.