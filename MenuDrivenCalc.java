/*
 * Program Name : CalculatorDemo.java
 * Author       : ASHIK S
 * Date         : July 31, 2025
 * Description  : This program simulates a basic menu-driven calculator 
 *                using a parameterized constructor, switch-case control 
 *                structure, and looping to allow repeated operations.
 */
package M1;
import java.util.*;
class Calculator{
	double numb1;
	double numb2;
	Calculator(double n1,double n2)
	{
		numb1 = n1;
		numb2 = n2;
	}
	double add()
	{
		return numb1+numb2;
	}
	double sub()
	{
		return numb1-numb2;
	}
	double mul()
	{
		return numb1*numb2;
	}
	double div()
	{ if(numb2 == 0) {
		 System.out.println("Error: Cannot divide by zero.");
		 return 1;
	}else {
		return numb1/numb2;
	}
}
}
public class MenuDrivenCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		do {
		System.out.print("--------CALCULATOR MENU--------\n1.ADD\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\nEnter your choice from(1-4): ");
		int ip = sc.nextInt();
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		Calculator c1 = new Calculator(n1,n2);
        double result = 0.0;
		switch(ip)
		{
		case 1 : result = c1.add();
		         break;
		case 2 : result = c1.sub();
                 break;
		case 3 : result = c1.mul();
                 break;         
		case 4 : result = c1.div();
                 break;
		default : System.out.print("Invalid input!!!");
		}
		System.out.println("Result: "+result);
         System.out.println("Do you want to continue? (Y/N): ");
         choice = sc.next().charAt(0);
         
		} while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the calculator!");
        sc.close();
	}

}
