package ex36;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        ArrayList list;
        list = StatsActions.generateList();
        System.out.print("Numbers: ");
        for(int i = 0; i < list.size(); i++){
            System.out.printf("%d ", (int)list.get(i));
        }
        System.out.print("\n");
        double avg = StatsActions.calculateAvg(list);
        int min = StatsActions.getMin(list);
        int max = StatsActions.getMax(list);
        double std_dev = StatsActions.getStdDev(list);
        System.out.printf("The average is %.1f\nThe minimum is %d\nThe maximum is %d\n The standard deviation is %.2f", avg, min, max, std_dev);
    }
}
