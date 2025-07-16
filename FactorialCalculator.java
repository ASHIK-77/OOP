/*
 * Program: FactorialCalculator.java
 * Author : Ashik.S
 * Date   : July 16, 2025
 * Description: This program calculates the factorial of a given non-negative integer.
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is only defined for positive number numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }

        sc.close();
    }
}
