package ex29;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Calculator {
    public static int isValid(String r){
        char arr[] = r.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(isLetter(arr[i])){
                return 0;
            }
        }
        if(Integer.parseInt(r) == 0){
            return -1;
        }
        return 72/Integer.parseInt(r);
    }
}
