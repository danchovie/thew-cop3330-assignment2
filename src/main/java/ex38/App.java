package ex38;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import ex27.Validator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //author's note: I surrendered here.
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String user_in = scan.nextLine();
        char c_arr[] = user_in.toCharArray();
        int c_len = ValueFilter.lengthChar(c_arr);
        int i_arr[] = ValueFilter.convertToIntArr(c_arr, c_len);
        int len = ValueFilter.lengthEven(i_arr);
        int fin_i_arr[] = ValueFilter.filterEvenNumbers(i_arr, len);
        System.out.print("The even numbers are");
        for(int i = 0; i < len; i++){
            System.out.printf(" %d", fin_i_arr[i]);
        }
        System.out.print(".");
    }
}
