package ex31;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String age, pulse;
        System.out.print("Please enter an age: ");
        age = scan.nextLine();
        System.out.print("Please enter a resting pulse: ");
        pulse = scan.nextLine();
        if(!Karvonen.isValid(age)||!Karvonen.isValid(pulse)){
            System.out.print("Sorry, you did not input a proper value.\n");
            return;
        }
        int i_age = Integer.parseInt(age);
        int i_pulse = Integer.parseInt(pulse);
        System.out.printf("Resting pulse:%d%10cAge:%d\n", i_pulse, ' ', i_age);
        System.out.printf("%s%5c%s\n", "Intensity", '|', "Rate");
        System.out.print("-------------|--------\n");
        for(double per = 0.55; per < 1; per += 0.05){
            int h_rate = Karvonen.heartRate(i_age, i_pulse, per);
            System.out.printf("%.0f%%%11c%d bpm\n", per*100, '|', h_rate);
        }
    }
}
