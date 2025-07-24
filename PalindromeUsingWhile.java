/*
 * Program: PalindromeUsingWhile.java
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 4 : 00 PM
 * Description: This program takes an integer as input and checks whether
 *              it is a palindrome using a while loop.
 */
package M1;
import java.util.*;
public class PalindromeUsingWhile {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int real;
	int rev=0;
	System.out.print("Enter a number: ");
	real = sc.nextInt();
	int num = real;
	while(num!=0)
	{
		int digit = num % 10;
		rev = rev*10 + digit;
		num/=10;
	}
	if(real == rev)
	{
		System.out.println("It is a palindrome!");
	}else
	{
		System.out.println("Not a palindrome!");
	}
	sc.close();
	}

}
