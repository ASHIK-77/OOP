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
        int largest,a,b,c;
     Scanner sc = new Scanner(System.in);
     //input three numbers
     System.out.print("Enter three numbers ");
     a = sc.nextInt();
     b = sc.nextInt();
     c = sc.nextInt();
     
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
        sc.close();
    }
    
}
