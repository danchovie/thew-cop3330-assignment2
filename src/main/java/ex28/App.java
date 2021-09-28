package ex28;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int num = scan.nextInt();
            sum += num;
        }
        System.out.printf("%d", sum);
    }
}
