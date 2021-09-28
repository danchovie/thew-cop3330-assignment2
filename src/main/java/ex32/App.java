package ex32;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import java.util.Scanner;

public class App {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int diff, rando = 0;
        System.out.print("Let's play Guess the Number!\n\nEnter the difficulty level (1, 2, or 3): ");
        diff = scan.nextInt();
        if(diff==1){
            rando = 1+(int)(Math.random()*10);
        }
        else if(diff==2){
            rando = 1+(int)(Math.random()*100);
        }
        else if(diff==3){
            rando = 1+(int)(Math.random()*1000);
        }
        else{
            System.out.print("You entered an improper difficulty. Try again another time!");
            return;
        }
        System.out.print("I have my number. What's your guess? ");
        scan.nextLine();
        String user_guess = scan.nextLine();
        int count = 0;
        while(GuessChecker.checker(rando,user_guess)!="X"){
            System.out.printf("%s", GuessChecker.checker(rando, user_guess));
            user_guess = scan.nextLine();
            count++;
        }
        System.out.printf("You got it in %d guesses!", count);
        System.out.print("Would you like to play again?");
        String sx = scan.nextLine();
        if(sx.equals("y")){
            App.main(args);
        }
    }
}
