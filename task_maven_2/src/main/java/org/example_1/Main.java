package org.example_1;
import org.example.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Math a = new Math();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to perform a math operation:");
        System.out.print("x1 = ");
        double x1 = in.nextDouble();
        System.out.print("x2 = ");
        double x2 = in.nextDouble();

        System.out.println("plus: " + a.plus(x1, x2));
        System.out.println("minus: " + a.minus(x1, x2));
        System.out.println("multiply: " + a.multiply(x1, x2));
        System.out.println("divide: " + a.divide(x1, x2));
    }
}