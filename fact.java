/*
 * Program: FactorialWhileLoop
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Description: This program calculates and prints the factorial of a given number using a while loop.
 *Time:09:49PM
 */
package M1;
import java.util.*;
public class fact {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n,i=1,fact=1;
	System.out.print("Enter a number: ");
	n = sc.nextInt();
	  if (n< 0) {
          System.out.println("Factorial is only defined for positive number numbers.");
      } else 
      {
    	  while(i<=n)
    	  {
    		 fact*=i; 
    		 i++;
    	  }
      }
	  System.out.println("Factorial:" +fact);
	}
	

}
