/*
 * Program: ArraySort.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program reads 'n' integers from the user,
 * stores them in an array, sorts them in ascending order,
 * and displays the sorted array.
 */
package M1;
import java.util.*;
public class ArraySort {

	public static void main(String[] args) {
		
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int i,temp;
    System.out.print("Enter the array elements\n");
    for(i=0;i<n;i++)
    {
    	arr[i] = sc.nextInt();
    }
    for(i=0;i<n;i++)
    { 
    	for(int j = 0;j<n-i-1;j++)
    	{
    		
    	if(arr[j]>arr[j+1])
    	{
    		temp = arr[j+1];
    		arr[j+1] = arr[j];
    		arr[j] = temp;
    	}
    }
	}
    System.out.print("Ascending order\n");
    for(i=0;i<n;i++)
    {
    	System.out.print("\t"+arr[i]);
    }
    sc.close();
	}
}


