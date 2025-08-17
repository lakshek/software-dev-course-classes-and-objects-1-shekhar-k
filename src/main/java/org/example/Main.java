package org.example;

import java.util.Scanner;

import static org.example.Calculator.add;
import static org.example.Calculator.subtract;
import static org.example.Calculator.multiply;
import static org.example.Calculator.divide;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Use the static methods you wrote in the Calculator class
        // to assign proper values to the four variables below
        // (instead of 0)
        int sum = add(a, b);
        int difference = subtract(a, b);
        int product = multiply(a, b);
        int quotient = divide(a, b);

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);
    }

}