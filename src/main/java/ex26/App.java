package ex26;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double balance, payment, rate;
        System.out.print("What is your balance? ");
        balance = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        rate = scan.nextDouble()/100.0;
        System.out.print("What is the monthly payment you can make? ");
        payment = scan.nextDouble();
        int months = PaymentCalculator.calculateMonthsUntilPaidOff(rate/365.0, balance, payment);
        System.out.printf("It will take you %d months to pay off this card.", months);
    }
}
