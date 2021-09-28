package ex27;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Validator {
    public static String valid_first(String first){
        if(first.equals("")){
            return "The first name must be filled in.";
        }
        if(first.length()<2){
            return "The first name must be at least 2 characters long.";
        }
        char arr[] = first.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!isLetter(arr[i])){
                return "The first name must be filled in.";
            }
        }
        return first;
    }

    public static String valid_last(String last){
        if(last.equals("")){
            return "The last name must be filled in.";
        }
        if(last.length()<2){
            return "The last name must be at least 2 characters long.";
        }
        char arr[] = last.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!isLetter(arr[i])){
                return "The last name must be filled in.";
            }
        }
        return last;
    }

    public static String valid_ID(String id){
        char arr[] = id.toCharArray();
        if(!isLetter(arr[0])||!isLetter(arr[1])){
            return "The employee ID must be in the format of AA-1234.";
        }
        if(arr[2]!='-'){
            return "The employee ID must be in the format of AA-1234.";
        }
        for(int i = 3; i < 7; i++){
            if(!isDigit(arr[i])){
                return "The employee ID must be in the format of AA-1234.";
            }
        }
        return id;
    }

    public static String valid_zip(String zip){
        char arr[] = zip.toCharArray();
        if(arr.length>5){
            return "The zipcode must be a 5 digit number.";
        }
        for(int i = 0; i < 5; i++){
            if(!isDigit(arr[i])){
                return "The zipcode must be a 5 digit number.";
            }
        }
        return zip;
    }

    public static String validateInput(String f_name, String l_name, String id, String zip){
        String res_1 = valid_first(f_name);
        String res_2 = valid_last(l_name);
        String res_3 = valid_ID(id);
        String res_4 = valid_zip(zip);
        String ret_val = res_1 + "\n" + res_2 + "\n" + res_3 + "\n" + res_4;
        return ret_val;
    }
}
