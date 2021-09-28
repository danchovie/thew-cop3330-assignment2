package ex26;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import static java.lang.Math.log;

public class PaymentCalculator {
    public static int calculateMonthsUntilPaidOff(double i, double b, double p){
        double pre;
        int n;
        pre = Math.ceil((-(1.0/30.0) * log(1 + b/p * (1 - Math.pow((1 + i),30))) / log(1 + i)));
        n = (int)pre;
        return n;
    }
}
