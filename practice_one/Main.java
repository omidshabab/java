import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the number of working hours: ");
        int workingHours = in.nextInt();

        System.out.print("Enter the hourly wage: ");
        double hourlyWage = in.nextDouble();

        double salaryBeforeTax = workingHours * hourlyWage;
        double tax = salaryBeforeTax * 0.1;
        double salaryAfterTax = salaryBeforeTax - tax;

        System.out.println("Salary before tax deduction: " + salaryBeforeTax);
        System.out.println("Salary after tax deduction: " + salaryAfterTax);
    }
    
}