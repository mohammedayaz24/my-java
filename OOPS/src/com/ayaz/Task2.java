package com.ayaz;
import java.util.*;

class BankAccount{
    String accHolder;
    double balance;

    public void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        if(amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " is credited to your account" + " " + this.accHolder);
            displayBalance();
        }
    }

    public void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double amount = sc.nextDouble();
        if(balance > amount){
            balance = balance - amount;
            System.out.println(amount+ "is debited from your account"+" "+this.accHolder);
            displayBalance();
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public void displayBalance(){
        System.out.println("Balance of"+" "+this.accHolder+" "+ "is" +" "+this.balance);
    }
}

public class Task2 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accHolder = "Mohammed Ayaz";
        acc1.balance = 1000;

        acc1.displayBalance();
        acc1.deposit();
        acc1.withdraw();
    }
}
