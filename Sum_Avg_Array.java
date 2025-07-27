/*
 * Program: Sum_Average_Array.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program reads 'n' integers from the user,
 * stores them in an array, and calculates the sum and average of the elements.
 */
package M1;
import java.util.*;
public class Sum_Avg_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,sum=0;
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements\n");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		double avg = (double) sum/n;
		System.out.print("\nSum: "+sum);
		System.out.print("\nAverage: "+avg);
		sc.close();

	}

}
