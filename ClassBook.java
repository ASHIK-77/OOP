/*
 * Program: Book.java
 * Description: This class represents a Book with a title, author, and price.
 *              It includes a constructor to initialize these values and a method to display them.
 * Author: ASHIK S
 * Date: July 28, 2025
 */
package M1;
import java.util.*;
class book{
   String title;
   String author;
   double price;
    book(String titl,String aut,double pr)
   {
	   title = titl;
	   author = aut;
	   price = pr;
   }
    public void display() {
    	System.out.print("Title: "+title);
    	System.out.print("\nAuthor: "+author);
    	System.out.print("\nPrice: "+price);
    	System.out.print("\n____________________\n");
    }
}
public class ClassBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of book : ");
		int n = sc.nextInt();
		sc.nextLine();
		book[] books = new book[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("\nEnter details for BOOK " + (i + 1));
            System.out.print("TITLE: ");
            String title = sc.nextLine();
            System.out.print("AUTHOR: ");
            String author = sc.nextLine();
            System.out.print("PRICE: ");
            double price = sc.nextDouble();
            sc.nextLine();
            books[i] = new book(title,author,price);
		}
	  System.out.println("\n📚Book Details:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("BOOK " + (i + 1) + ":");
	            books[i].display();
	            }
         sc.close();
}
}