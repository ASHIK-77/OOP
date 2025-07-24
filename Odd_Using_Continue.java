/*
 * Program: OddNumbersWithContinue
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 2:10 PM
 * Description: This program takes a number 'n' as input from the user
 *              and prints all odd numbers from 1 to n using a for loop.
 *              The continue statement is used to skip even numbers.
 */
package M1;
import java.util.*;
public class Odd_Using_Continue {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.print("Enter the limit : ");
	n = sc.nextInt();
	System.out.print("Vowels are ");
	for(int i=1;i<=n;i++)
	{
		if(i%2 == 0)
		{
			continue;
		}else
		{
			System.out.println("\t"+i);
		}
	}
	sc.close();
	}

}
