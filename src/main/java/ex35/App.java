package ex35;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        ArrayList<String> list;
        list = ArrayActions.generateArray();
        int rand_ind = (int)(Math.random()*list.size());
        System.out.printf("The winner is...%s.", ArrayActions.randomWinner(rand_ind, list));
    }
}
