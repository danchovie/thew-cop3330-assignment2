package ex30;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */


public class App {
    public static void main(String[] args){
        for(int i = 1; i <= 12; i++){
            String ret_str = "";
            for(int j = 1; j <= 12; j++){
                System.out.printf("%-5s ", i*j);
            }
            System.out.print("\n");
        }
    }
}
