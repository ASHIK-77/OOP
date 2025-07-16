/*
 * Program: student_grade.java
 * Author : Ashik.S 
 * Date   : July 16, 2025
 * Description: This program prints the grade of a student.
 */
import java.util.*;
public class student_grade {
    public static void main(String[] args){
        String name,grade;
        double score;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student\n1.NAME\n2.Score");
        name = sc.nextLine();
        score = sc.nextDouble();
        if(score >= 90 && score<=100)
        {
            grade = "S";
        }else if(score >= 80 && score<=89)
        {
            grade = "A+";
        }else if(score >= 70 && score<=79)
        {
            grade = "A";
        }else if(score >= 60 && score<=69)
        {
            grade = "B+";
        }else if(score >= 50 && score<=59)
        {
            grade = "B";
        }else if(score >= 40 && score<=49)
        {
            grade = "C+";
        }else if(score >= 30 && score<=39)
        {
            grade = "C";
        }else if(score >24 && score<=29)
        {
            grade = "D";
        }else if(score == 24)
        {
            grade = "P";
        }else if (score < 24 && score >0)
        {
          grade = "F";
        }else{
            grade = "Invalid";
        }
        System.out.println("NAME: " + name+"\nSCORE: " + score+ "\nGRADE: " + grade);
        sc.close();
        


    }
    
}
