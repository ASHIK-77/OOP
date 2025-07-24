/*
 * Program: SimpleCalculator.java
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 3:10 PM
 * Description: This program takes two numbers and an operator as input
 *              and performs the corresponding arithmetic operation using a switch statement.
 */
package M1;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result=0;
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Ente operation\n+ : ADDITION\n- : SUBTACTION\n* : MULTIPLICATION\n/ : DIVISION");
		char operator = sc.next().charAt(0);
		switch(operator) {
		case '+' : result = num1+num2;
		           break;
		case '-' : result = num1-num2;
		           break;
		case '*' : result = num1*num2;
		           break;
		case '/' : result = num1/num2;
		           break;
		default  : System.out.println("Error input !");
		           return;
		}
		System.out.println("RESULT\n" + num1 + " " + operator + " " + num2 + " = " + result);
		sc.close();

	}

}
