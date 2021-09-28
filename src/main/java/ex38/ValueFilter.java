package ex38;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;

public class ValueFilter {
    public static int lengthChar(char c_arr[]){
        int r_int = 0;
        for(int i = 0; i < c_arr.length; i++){
            if(c_arr[i] == ' '){
                continue;
            }
            else{
                r_int++;
            }
        }
        return r_int;
    }

    public static int[] convertToIntArr(char c_arr[], int length){
        int i_arr[] = new int[length];
        int j = 0;
        for(int i = 0; i < length; i++){
            if(c_arr[i] == ' '){
                continue;
            }
            int c = Integer.parseInt(String.valueOf(c_arr[i]));
            i_arr[j] = c;
            j++;
        }
        return i_arr;
    }

    public static int lengthEven(int arr[]){
        int r_int = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                continue;
            }
            if(arr[i]%2==0){
                r_int++;
            }
        }
        return r_int;
    }

    public static int[] filterEvenNumbers(int arr[], int len){
        int[] i_arr = new int[len];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                i_arr[j] = arr[i];
                j++;
            }
        }
        return i_arr;
    }
}
