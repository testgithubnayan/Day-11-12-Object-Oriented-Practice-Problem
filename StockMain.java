package com.bridgelabz;

import java.util.Scanner;

public class StockMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of stocks: ");
        int noOfStocks = scanner.nextInt();
        StockReport[] stocks = new StockReport[noOfStocks];

        for(int i = 0; i < noOfStocks; i++){
            System.out.println("____________________");
            System.out.println("Enter stock name: ");
            String stockName = scanner.next();
            System.out.println("Enter no of shares: ");
            int noOfShares = scanner.nextInt();
            System.out.println("Enter price of shares: ");
            int sharePrice = scanner.nextInt();

            System.out.println("Do you want to add more stock(y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y'){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

            stocks[i] = new StockReport(stockName,noOfShares,sharePrice);
        }

        StockReport sr = new StockReport();
        sr.displayReport(stocks);
    }
}
