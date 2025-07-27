/*
 * Program: ArrayCountEvenOdd.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program reads 'n' integers from the user, stores them in an array,
 * and counts how many of them are even and how many are odd.
 */
package M1;
import java.util.*;
public class ArrayCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n = sc.nextInt();
		int i,CountEven,CountOdd;
		int[] arr = new int[n];
		System.out.println("Enter the elements\n");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		CountEven = CountOdd = 0;
		for(i=0;i<n;i++)
		{
			if(arr[i]%2 == 0)
			{
				CountEven++;
			}else {
				CountOdd++;
			}
		}
		System.out.print("Count of Even : "+CountEven);
		System.out.print("\nCount of Odd : "+CountOdd);
		sc.close();

	}

}
