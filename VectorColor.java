/*
 * Program: ColorVector.java
 * Description: This program creates a Vector of Strings containing color names,
 *              removes the color "Green", and displays the final contents.
 * Author: ASHIK S
 * Date: August 1, 2025
 */
package M1;
import java.util.Vector;

public class VectorColor {

	public static void main(String[] args) {
		Vector<String> color = new Vector<>();
		color.add("Red");
		color.add("Green");
		color.add("Blue");
		color.add("Yellow");
		System.out.print("Before removing\n");
		for(String colors : color)
		{
			System.out.println(colors);
		}
		color.remove("Green");
		System.out.println("\nAfter removing\n");
		for(String colors : color )
		{
			System.out.println(colors);
		}
	}

}
