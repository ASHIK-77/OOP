/*
 * Program: BankAccount.java
 * Description: This program defines a BankAccount class to store and manage
 *              account details. It includes a method to deposit money and 
 *              display updated account information.
 * Author: ASHIK S
 * Date  : July 28, 2025
 */

package M1;
import java.util.*;

class BankAccountDetails {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccountDetails(int accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolder = accHolder;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.printf("Balance        : ₹%.2f\n", balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder name: ");
        String holder = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccountDetails account = new BankAccountDetails(accNo, holder, bal);

        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();
        account.deposit(amt);

        System.out.println("\n--- Updated Account Details ---");
        account.displayDetails();

        sc.close();
    }
}
