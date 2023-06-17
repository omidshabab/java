package practice_four;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        int n = in.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}