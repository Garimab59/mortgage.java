package com.codewithgarima;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int percent = 100;
        int month = 12;

        int principal = 0;
        double monthlyInterest = 0 ;
        int numberOfPayments = 0;



        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;

            System.out.println("Enter the value between 10000 and 1000000 ");


        }while(true)
        {
            System.out.println("Annual Interest Rate: ");
            double annualInterest = scanner.nextDouble();
            if(annualInterest >= 1 && annualInterest <=30){
                 monthlyInterest = annualInterest / percent / month;
                break;
            }
            System.out.println("Enter the Value between 1 and 30 ");
        }
        while (true) {
            System.out.println("Periods (Years): ");
              byte year = scanner.nextByte();
              if(year >= 1 && year <= 30) {
                  numberOfPayments = year * month;
                  break;
              }
            System.out.println("Enter a value between 1 and 30. ");

        }
        double mortgage = principal
                  *(monthlyInterest * Math.pow(1 + monthlyInterest , numberOfPayments))
                 /(Math.pow(1 + monthlyInterest , numberOfPayments) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage" + mortgageFormatted);

    }
}
