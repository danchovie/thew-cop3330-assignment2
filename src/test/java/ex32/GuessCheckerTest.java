package ex32;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessCheckerTest {

    @Test
    void checker() {
        assertEquals("You did not enter a number. Guess again.", GuessChecker.checker(1, "AAA1"));
        assertEquals("Too low. Guess again.", GuessChecker.checker(50, "10"));
        assertEquals("Too high. Guess again.", GuessChecker.checker(50, "90"));
        assertEquals("X", GuessChecker.checker(50, "50"));
    }
}