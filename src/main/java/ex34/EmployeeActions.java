package ex34;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

public class EmployeeActions {
    public static void printEmployees(String arr[]){
        System.out.printf("There are %d employees:\n", arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%s\n", arr[i]);
        }
    }

    public static String[] updateEmployees(String removal, String arr[]){
        for(int i = 0; i < arr.length; i++){
            if(removal.equals(arr[i])){
                arr[i] = "NO_LONGER";
                break;
            }
        }
        String ret_arr[] = new String[arr.length-1];
        int ind_ret = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j].equals("NO_LONGER")){
                continue;
            }
            ret_arr[ind_ret] = arr[j];
            ind_ret++;
        }
        return ret_arr;
    }
}
