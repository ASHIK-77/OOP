/*
 * Program: MaxInVector.java
 * Description: This program creates a Vector of Integers, then finds and prints the maximum value.
 * Author: ASHIK S
 * Date: August 1, 2025
 */
package M1;
import java.util.Vector;
public class VectorMax {

	public static void main(String[] args) {
	Vector<Integer> number = new Vector<>();
	number.add(25);
	number.add(60);
	number.add(15);
	number.add(80);
	number.add(45);
	System.out.println("Elements : "+number);
	int max = number.get(0);
	for(int num : number)
	{
		if(max < num)
		{
			max = num;
		}
	}
	 System.out.println("\nMaximum value in the Vector: " + max);
	}

}
