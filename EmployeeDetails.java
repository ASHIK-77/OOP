/*
 * Program: EmployeeDetails.java
 * Author : ASHIK S
 * Date   : July 27, 2025
 * Description:
 * This program defines an Employee class with empId, empName, and salary.
 * It creates two employee objects using user input and displays their details.
 */
package M1;
import java.util.*;
class Employee {
    int empId;
    String empName;
    double salary;
    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }
void displayEmployee() {
    System.out.println("Employee ID   : " + empId);
    System.out.println("Employee Name : " + empName);
    System.out.println("Salary        : " + salary);
    System.out.println("-----------------------------");
}}
public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter details for Employee 1:");
	        System.out.print("ID: ");
	        int id1 = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Name: ");
	        String name1 = sc.nextLine();
	        System.out.print("Salary: ");
	        double sal1 = sc.nextDouble();
	        System.out.println("\nEnter details for Employee 2:");
	        System.out.print("ID: ");
	        int id2 = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Name: ");
	        String name2 = sc.nextLine();
	        System.out.print("Salary: ");
	        double sal2 = sc.nextDouble();
	        Employee e1 = new Employee(id1, name1, sal1);
	        Employee e2 = new Employee(id2, name2, sal2);
	        System.out.println("\nEmployee Details:");
	        e1.displayEmployee();
	        e2.displayEmployee();

	        sc.close();
	    }
	}
	
