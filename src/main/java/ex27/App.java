package ex27;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String f_name = scan.nextLine();
        System.out.print("Enter the last name: ");
        String l_name = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String id = scan.nextLine();
        String print_val = Validator.validateInput(f_name, l_name, id, zip);
        System.out.printf("%s", print_val);
    }
}
