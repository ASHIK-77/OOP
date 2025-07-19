/*
 * Program: GCDWhileLoop.java
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Time   : 10:40 PM
 * Description: This program finds the GCD (Greatest Common Divisor) of two numbers using a while loop.
 */
package M1;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        System.out.println("GCD is: " + a);
	    }
	}

	


