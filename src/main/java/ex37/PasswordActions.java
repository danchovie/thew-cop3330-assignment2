package ex37;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordActions {
    public static ArrayList generateCharList(){
        ArrayList<Character> list1 = new ArrayList<>();
        String chars1 = "abcdefghijklmnopqrstuvwxyz";
        for(char ch : chars1.toCharArray()){
            list1.add(ch);
        }
        return list1;
    }

    public static ArrayList generateIntList(){
        ArrayList<Character> list2 = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list2.add((char)(57-i));
        }
        return list2;
    }

    public static ArrayList generateSpecList(){
        ArrayList<Character> list3 = new ArrayList<>();
        String chars2 = "`~!@#$%^&*()-_=+[{]}|;:,<.>/?\"'";
        for(char ch2 : chars2.toCharArray()){
            list3.add(ch2);
        }
        return list3;
    }

    public static String generatePassword(ArrayList<Character> list1, ArrayList<Character> list2, ArrayList<Character> list3, int min_length, int specs, int nums){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < specs; i++){
            list.add(list3.get((int)(Math.random()*list3.size())));
        }
        for(int j = 0; j < nums; j++){
            list.add(specs+j,list2.get((int)(Math.random()*list2.size())));
        }
        for(int k = nums+specs; k < min_length; k++){
            list.add(list1.get((int)(Math.random()*list1.size())));
        }
        Collections.shuffle(list);
        String ret_str = "";
        for(int n = 0; n < list.size(); n++){
            ret_str += list.get(n);
        }
        return ret_str;
    }
}
