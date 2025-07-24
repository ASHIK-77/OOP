/*
 * Program: SumOfDigits.java
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 2:55 PM
 * Description: This program takes a four-digit number as input
 *              and calculates the sum of its digits using a while loop.
 */
package M1;
import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int num,sum=0;
	 System.out.print("Enter a number : ");
     num = sc.nextInt();
     if (num < 1000 || num > 9999) {
         System.out.println("Invalid input. Please enter a 4-digit number.");
     } else {
         int temp = num;
         while (temp > 0) {
             sum += temp % 10;
             temp /= 10;
         }
         System.out.println("Sum of digits of " + num + " is: " + sum);
     }

     sc.close();
 }
}
