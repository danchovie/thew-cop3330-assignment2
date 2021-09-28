/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */
package ex24;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String user_s1, user_s2;
        System.out.printf("Enter two strings and I'll tell you if they are anagrams:\n");
        System.out.printf("Enter the first string: ");
        user_s1 = scan.nextLine();
        System.out.printf("Enter the second string: ");
        user_s2 = scan.nextLine();
        if(isAnagram(user_s1,user_s2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", user_s1, user_s2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", user_s1, user_s2);
        }
    }

    static boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
