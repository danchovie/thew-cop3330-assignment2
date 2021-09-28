package ex34;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String arr[] = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        EmployeeActions.printEmployees(arr);
        System.out.print("Enter an employee name to remove: ");
        String removal = scan.nextLine();
        String final_arr[] = EmployeeActions.updateEmployees(removal, arr);
        EmployeeActions.printEmployees(final_arr);
    }
}
