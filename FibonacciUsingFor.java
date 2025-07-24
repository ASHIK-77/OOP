/*
 * Program: FibonacciUsingFor.java
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 03 : 40 PM
 * Description: This program takes a number 'n' as input
 *              and prints the first 'n' Fibonacci numbers using a for loop.
 */

package M1;
import java.util.*;
public class FibonacciUsingFor {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int n = sc.nextInt();
		 if (n <= 0) {
	            System.out.println("Please enter a positive number.");
	            return;
	        }
		 int a = 0;
		 int b = 1;
		 int temp;
		for(int i=0;i<n;i++)
		{ 
			System.out.print(+a+"\t");
			    temp = a + b;
	            a = b;
	            b = temp;
		}
		sc.close();
	}

}
