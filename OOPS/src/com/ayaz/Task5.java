package com.ayaz;

import java.util.Scanner;
class BankAccount1 {
    private String accHolder;
    private double balance;

    // Constructor
    BankAccount1(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " is credited to " + accHolder);
            displayBalance();
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw
    public void withdraw() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println(amount + " is debited from " + accHolder);
            displayBalance();
        } else {
            System.out.println("Invalid Amount or Insufficient Balance");
        }
    }

    // Display Balance
    public void displayBalance() {
        System.out.println("Balance of " + accHolder + " is " + getBalance());
    }
}

public class Task5 {
    public static void main(String[] args) {
        BankAccount1 acc1 = new BankAccount1("Mohammed Ayaz", 1000);
        acc1.displayBalance();
        acc1.deposit();
        acc1.withdraw();
        acc1.displayBalance();
    }
}
