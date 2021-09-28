package ex31;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import static java.lang.Character.isDigit;

public class Karvonen {
    public static boolean isValid(String input){
        char arr[] = input.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!isDigit(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static int heartRate(int age, int pulse, double intensity){
        double TargetHeartRate = (((220 - age) - pulse) * intensity) + pulse;
        int ret_rate = (int)TargetHeartRate;
        return ret_rate;
    }
}
