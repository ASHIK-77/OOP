/*
 * Program: PrimeCheck.java
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Time   : 09:31 PM
 * Description: This program checks whether a given number is prime using if-else statements and a for loop.
 */
package M1;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,prime = 0;
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
			if(n%i == 0) {
				System.out.println("Not a prime number");
				prime = 1;
				break;
			}else
			{   
			  prime = 0;
				
			 
			}
		}
		if(prime == 0){
			System.out.println("It is a prime number");
		}

	}

}
