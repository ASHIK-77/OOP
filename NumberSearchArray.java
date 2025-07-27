/*
 * Program: NumberSearchArray.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program reads 'n' integers from the user,
 * stores them in an array, and searches for a given number.
 * It prints the position if found or a message if not found.
 */
package M1;
import java.util.*;
public class NumberSearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,flag=0;
		System.out.print("Enter the number of element: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements\n");
		for(i=0;i<n;i++)
		{
		 arr[i] = sc.nextInt();	
		}
		System.out.print("Enter the number to search: ");
		int num = sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i] == num)
			{
				System.out.print("Number found\n index: "+(i+1));
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.print("\nkey not found");
		}
        sc.close();
	}

}
