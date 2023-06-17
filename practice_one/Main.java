import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter work hours: ");
        int workH = in.nextInt();

        System.out.print("Enter tip per hour: ");
        double tipH = in.nextDouble();

        double tipNoTax = workH * tipH;
        double tax = tipNoTax * 0.1;
        double tipTax = tipNoTax - tax;

        System.out.println("Tip without tax: " + tipNoTax);
        System.out.println("Tip with tax: " + tipTax);
    }
    
}