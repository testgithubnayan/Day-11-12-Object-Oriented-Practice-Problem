package com.bridgelabz;

import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.println("Enter amount for withdrawal: ");
        double withdraw = sc.nextDouble();
        if (withdraw > balance)
            System.out.println("Withdraw exceeding  the balance please enter the  correct amount");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is: " + balance);

    }
}
