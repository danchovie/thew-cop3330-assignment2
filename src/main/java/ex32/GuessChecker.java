package ex32;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import static java.lang.Character.isDigit;

public class GuessChecker {
    public static String checker(int actual, String u_guess){
        char arr[] = u_guess.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!isDigit(arr[i])){
                return "You did not enter a number. Guess again.";
            }
        }
        int guess = Integer.parseInt(u_guess);
        if(actual>guess){
            return "Too low. Guess again.";
        }
        else if(actual<guess){
            return "Too high. Guess again.";
        }
        else{
            return "X";
        }
    }
}
