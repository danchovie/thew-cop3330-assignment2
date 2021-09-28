/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */
package ex25;

public class PasswordValidator {
    static int strength_indicator(String password){
        int nums = 0, lets = 0, specs = 0;
        password = password.toLowerCase();
        char arr[] = password.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]-97>=0&&arr[i]-97<=25){
                lets++;
            }
            else if(arr[i]-48>=0&&arr[i]-58<=0){
                nums++;
            }
            else{
                specs++;
            }
        }
        if(nums>0&&lets<1&&specs<1&&nums<8){
            return 1;
        }
        else if(nums<1&&lets>0&&specs<1&&lets<8){
            return 2;
        }
        else if(nums>0&&lets>0&&specs<1&&(nums+lets>=8)){
            return 3;
        }
        else if(nums>0&&lets>0&&specs>0&&(nums+lets+specs>=8)){
            return 4;
        }
        else if(nums>0&&lets<1&&specs<1&&nums>=8){
            return 5;
        }
        else if(nums<1&&lets>0&&specs<1&&lets>=8){
            return 6;
        }
        else if(nums>0&&lets>0&&specs<1&&(nums+lets<8)){
            return 7;
        }
        else if(nums>0&&lets>0&&specs>0&&(nums+lets+specs<8)){
            return 8;
        }
        return 0;
    }
}
