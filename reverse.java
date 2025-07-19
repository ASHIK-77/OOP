/*
 * Program: ReverseNumber.java
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Time   : 10:03 PM
 * Description: This program prints the reverse of a given number using a for loop.
 */
package M1;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,i;
		System.out.print("Enter a number: ");
		number = sc.nextInt();
		int rev = 0;
		for(i=number;i!=0;i/=10)
		{
			int digit = i % 10;
			 rev = rev*10+digit;
			 
		}
		System.out.print("Reversed number is : "+rev);
		

	}

}
