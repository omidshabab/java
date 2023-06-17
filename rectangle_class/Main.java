package rectangle_class;
import java.util.Scanner;
import java.lang.System;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        int w, l;

        System.out.println("Enter a width: ");
        w = in.nextInt();
        System.out.println("Enter a length: ");
        l = in.nextInt();

        rectangle.setWidth(w);
        rectangle.setLength(l);

        System.out.println(rectangle.P());
        System.out.println(rectangle.S());
    }

    public static class Rectangle{
        private int width, length;

        public void setWidth(int w){
            width = w;
        }

        public void setLength(int l){
            length = l;
        }

        public int P(){
            return 2*(width+length);
        }

        public int S(){
            return width*length;
        }
    }
}