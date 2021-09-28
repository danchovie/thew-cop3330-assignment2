package ex37;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList<Character> list1 = PasswordActions.generateCharList();
        ArrayList<Character> list2 = PasswordActions.generateIntList();
        ArrayList<Character> list3 = PasswordActions.generateSpecList();
        Scanner scan = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int i1 = scan.nextInt();
        System.out.print("How many special characters? ");
        int i2 = scan.nextInt();
        System.out.print("How many numbers? ");
        int i3 = scan.nextInt();
        String fin = PasswordActions.generatePassword(list1, list2, list3, i1, i2, i3);
        System.out.printf("Your password is %s", fin);
    }
}
