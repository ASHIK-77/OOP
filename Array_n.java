/*
 * Program: Arrayn.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program takes 'n' numbers as input from the user,
 * stores them in an array, and then displays the array elements
 * in both original and reverse order.
 */
package M1;
import java.util.*;
public class Array_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+ " elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Orginal order");
		for(int i=0;i<n;i++) {
			System.out.print("\t"+arr[i]);
		}
		System.out.println("\nReverse order");
		for(int i = n-1 ; i>=0;i--)
		{
			System.out.print("\t"+arr[i]);
		}
		sc.close();
		
	}

}
