/*
 * Program: MaxMinArray.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program reads 'n' integers from the user,
 * stores them in an array, and finds the maximum and minimum values.
 */
package M1;
import java.util.*;
public class MaxMinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements\n");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int lar=arr[0],sml=arr[1];
		for(i=0;i<n;i++)
		{
			if(lar<=arr[i])
			{
				lar = arr[i];
			}else if(arr[i]<sml)
			{
				sml = arr[i];
			}
		}if(lar == sml)
		{
			System.out.print("All are same");
			return;
		}
		System.out.print("\nLargest: "+lar);
		System.out.print("\nSmallest: "+sml);
		sc.close();
	}

}
