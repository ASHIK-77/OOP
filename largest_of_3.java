/*
 * Program: largest_of_3.java
 * Author : Ashik.S 
 * Date   : July 16, 2025
 * Description: This program prints "Largest of three numbers" to the console.
 */


import java.util.Scanner;
public class largest_of_3 {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     //input three numbers
     System.out.print("Enter number 1: ");
     int a = sc.nextInt();

     System.out.print("Enter number 2: ");
     int b = sc.nextInt();

     System.out.print("Enter number 3: ");
     int c = sc.nextInt();
     
     int largest;
     if(a>b && a>c)
     {
        largest = a;
     }
     else if(b>a && b>c)
     {
        largest = b ;
     }
     else{
        largest = c;
     }
     System.out.println("Largest is:" + largest);
    }
    
}
