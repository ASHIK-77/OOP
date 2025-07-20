/*
 * Program     : Box Volume Calculator
 * Author      : ASHIK
 * Date        : July 20, 2025
 * Description : This program demonstrates a simple class in Java that calculates
 *               the volume of a box using instance variables.
 */

package M1;
import java.util.*;
class box{
	double height;
	double width;
	double depth;
}
public class Box_vol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		box mybox = new box();
		double vol;
		System.out.print("Enter the height of the box: ");
		mybox.height = sc.nextDouble();
		System.out.print("Enter the width of the box: ");
                mybox.width = sc.nextDouble();
                System.out.print("Enter the depth of the box: ");
                mybox.depth = sc.nextDouble();
                vol = mybox.width * mybox.height * mybox.depth;
                System.out.println("volume is: "+vol);
                sc.close();
	}

}
