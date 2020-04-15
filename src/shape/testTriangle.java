package shape;

import java.util.Scanner;

public class testTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        double a = sc.nextDouble();
        System.out.println("Enter side 2");
        double b = sc.nextDouble();
        System.out.println("Enter side 3");
        double c = sc.nextDouble();
        Triangle t = new Triangle("Red",true,a,b,c);
        t.checkTriangle();
        System.out.println(t);
    }
}
