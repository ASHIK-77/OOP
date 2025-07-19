/*
 * Program: FibonacciWhileLoop.java
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Time   : 09:37 PM
 * Description: This program prints the Fibonacci series up to a given number using a while loop.
 */
package M1;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range,i;
		System.out.print("Enter the range upto:\t");
		range = sc.nextInt();
		System.out.println("Fibonacci series upto "+range);
		int a = 0,b = 1;
		while(a<range)
		{
			System.out.print("\t"+a);
			int c = a+b;
			a = b;
			b = c;
		}
		

	}

}
