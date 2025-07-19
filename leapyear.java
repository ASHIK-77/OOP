/*
 * Program: LeapYearCheck.java
 * Author : Ashik.S
 * Date   : July 18, 2025
 * Time   : 10:15 PM
 * Description: This program checks if a given year is a leap year using if-else statements.
 */
package M1;
import java.util.*;
public class leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Enter a year: ");
		year = sc.nextInt();
		if(year % 400 == 0 || year % 4 ==0 && year % 100 != 0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Not a leap year ");
		}
	}

}
