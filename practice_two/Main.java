package practice_two;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        float x, _calculateX;

        x = in.nextFloat();

        _calculateX = calculate(x);

        System.out.println(_calculateX);
    }

    public static float calculate(float x){
        float _calculateX;

        _calculateX = 1 / ((x*x) + x + 3);

        return _calculateX;
    }
}