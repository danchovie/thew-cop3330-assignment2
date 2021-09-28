package ex35;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayActions {
    public static ArrayList<String> generateArray(){
        Scanner scan = new Scanner(System.in);
        String name = "START";
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while(!name.equals("")){
            System.out.print("Enter a name: ");
            name = scan.nextLine();
            if(name.equals("")){
                break;
            }
            list.add(i, name);
            i++;
        }
        return list;
    }

    public static String randomWinner(int rand_ind, ArrayList<String> list){
        String ret_str = list.get(rand_ind);
        return ret_str;
    }
}
