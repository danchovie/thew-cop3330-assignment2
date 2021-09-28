/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */
package ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String user_pass, power = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password: ");
        user_pass = scan.nextLine();
        int strength = PasswordValidator.strength_indicator(user_pass);
        switch(strength){
            case 0:
                power = "strange";
                System.out.printf("There must be some error in the password, or the Validator didn't catch it.");
                break;
            case 1:
                power = "very weak";
                break;
            case 2:
                power = "weak";
                break;
            case 3:
                power = "strong";
                break;
            case 4:
                power = "very strong";
                break;
            case 5:
                power = "long numerical";
                break;
            case 6:
                power = "long character";
                break;
            case 7:
                power = "short num/char";
                break;
            case 8:
                power = "short num/char/special";
                break;
        }
        System.out.printf("The password \"%s\" is a %s password.", user_pass, power);
    }
}