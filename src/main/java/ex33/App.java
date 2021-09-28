package ex33;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String question;
        System.out.println("What's your question?");
        question = scan.nextLine();
        int index = (int)(Math.random()*4);
        System.out.printf("%s", MagicConch.ohMagicConch(index));
    }
}
