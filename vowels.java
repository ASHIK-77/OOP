/*
 * Program: VowelOrConsonant.java
 * Author : ASHIK S
 * Date   : July 24, 2025
 * Time   : 2:03 PM
 * Description: This program takes an alphabet as input from the user
 *              and uses a switch statement to determine whether the 
 *              input is a vowel or a consonant.
 */

package M1;
import java.util.*;
public class vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letter;
		System.out.print("Enter a charecter: ");
		letter = sc.next().toLowerCase().charAt(0);
		if(!Character.isLetter(letter))
		{
			System.out.println("Invalid input!!!");
		}else {
        switch(letter) {
        case 'a': 
        case'e': 
        case'i': 
        case'o': 
        case'u': 
        System.out.println("It is a vowel!!!");
        break;
        default: System.out.println("not a vowel!!! ");
        }}
        sc.close();
				
	}

}
