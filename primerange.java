/*
 * Program: PrimeNumbers1to100
 * Author : Ashik.S
 * Date   : July 19, 2025
 * Time   : 12:00 AM
 * Description: This program prints all prime numbers between any given range using for loop and if-else statements.
 */
package M1;
import java.util.*;

public class primerange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rangef, rangeu;

        System.out.print("Enter the range from: ");
        rangef = sc.nextInt();

        System.out.print("Enter range up to: ");
        rangeu = sc.nextInt();

        System.out.println("Prime numbers between " + rangef + " and " + rangeu + ":");

        for (int i = rangef; i <= rangeu; i++) {
           int Prime = 0;

            if (i <= 1) {
                continue; 
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    Prime = 1;
                    break;
                }
            }

            if (Prime==0) {
                System.out.print("\t"+i );
            }
        }
    }
}
