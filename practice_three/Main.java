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
