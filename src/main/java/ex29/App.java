package ex29;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int calc_y = 0;
        while(true) {
            System.out.print("What is the rate of return? ");
            String years = scan.nextLine();
            calc_y = Calculator.isValid(years);
            if(calc_y==-1){
                System.out.print("Sorry, Zero is not a valid rate.\n");
            }
            else if(calc_y==0){
                System.out.print("Sorry. That's not a valid rate.\n");
            }
            else{
                System.out.printf("It will take %d years to double your initial investment.\n", calc_y);
                break;
            }
        }
    }
}
