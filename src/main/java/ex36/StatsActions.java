package ex36;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.isDigit;

public class StatsActions {
    public static ArrayList generateList(){
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        String u_input = "";
        int i = 0;
        while(!u_input.equals("done")){
            System.out.print("Enter a number: ");
            u_input = scan.nextLine();
            if(u_input.equals("done")){
                break;
            }
            if(!isValid(u_input)){
                System.out.print("Improper input. Try again.\n");
                continue;
            }
            int u_val= Integer.parseInt(u_input);
            list.add(i, u_val);
            i++;
        }
        return list;
    }

    public static boolean isValid(String str){
        char arr[] = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(!isDigit(arr[i])){
                return false;
            }
        }
        return true;
    }

    public static double calculateAvg(ArrayList list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += (int)list.get(i);
        }
        double avg = (double)sum/list.size();
        return avg;
    }

    public static int getMin(ArrayList list){
        int min = (int)list.get(0);
        for(int i = 1; i < list.size(); i++){
            if((int)list.get(i)<min){
                min = (int)list.get(i);
            }
        }
        return min;
    }

    public static int getMax(ArrayList list){
        int max = (int)list.get(0);
        for(int i = 1; i < list.size(); i++){
            if((int)list.get(i)>max){
                max = (int)list.get(i);
            }
        }
        return max;
    }

    public static double getStdDev(ArrayList list){
        double sum = 0.0;
        double avg = calculateAvg(list);
        for(int i = 0; i < list.size(); i++){
            sum += Math.pow((int)list.get(i)-avg, 2);
        }
        double ret_val = sum/(list.size());
        ret_val = Math.sqrt(ret_val);
        ret_val = (double) Math.round(ret_val * 100) / 100;
        return ret_val;
    }
}
