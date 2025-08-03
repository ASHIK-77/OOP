/*
 * Program: SearchItemVector.java
 * Description: This program creates a Vector of Strings containing item names,
 *              takes an item name as input from the user, and checks whether
 *              it exists in the Vector.
 * Author: ASHIK S
 * Date: August 1, 2025
 */
package M1;
import java.util.Vector;
import java.util.*;
public class VectorItemSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> item = new Vector<>();
		    item.add("PEN");
	        item.add("NOTEBOOK");
	        item.add("ERASER");
	        item.add("MARKER");
	    System.out.println("Enter item to search: ");
	    String input = sc.nextLine().toUpperCase();;
	    if (item.contains(input)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }
	    sc.close();
	}

}
