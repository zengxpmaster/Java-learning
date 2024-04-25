package april.day15;

import java.util.Scanner;

public class Test2 {
    static double a, b;

    static class Compute {
        double add(double x, double y) {
            return x + y;

        }

        double sub(double x, double y) {
            return x - y;

        }

        double mul(double x, double y) {
            return x * y;

        }

        double div(double x, double y) {
            return x / y;

        }
    }

    public static void main(String[] args) {
        Compute c = new Compute();
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("a + b = " + c.add(a, b));
        System.out.println("a - b = " + c.sub(a, b));
        System.out.println("a * b = " + c.mul(a, b));
        System.out.println("a / b = " + c.div(a, b));
    }
}
