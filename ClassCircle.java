/*
 * Program: ClassCircle.java
 * Description: This class represents a circle with a given radius.
 *              It includes methods to compute and display:
 *              - Area of the circle using formula: πr²
 *              - Circumference of the circle using formula: 2πr
 * Author: ASHIK S
 * Date: July 28, 2025
 */
package M1;
import java.util.*;
class circle{
	double radius;
	circle(double r)
	{
		radius = r;
	}
	public void displayarea()
	{
		double area = Math.PI * radius * radius;
		System.out.print("Area : "+area);
	}
	public void displaycircumference()
	{
		double circumference = 2 * Math.PI * radius;
        System.out.println("\nCircumference of Circle: " + circumference);
	}
	
}
public class ClassCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rad;
		System.out.print("Enter the radius: ");
		rad = sc.nextInt();
		circle c = new circle(rad);
		c.displayarea();
		c.displaycircumference();
		sc.close();
		
	}

}
