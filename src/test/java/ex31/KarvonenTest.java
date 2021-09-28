package ex31;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenTest {

    @Test
    void isValid() {
        assertEquals(true, Karvonen.isValid("25"));
        assertEquals(false, Karvonen.isValid("AAA1"));
    }

    @Test
    void heartRate() {
        assertEquals(138, Karvonen.heartRate(22, 65, 0.55));
    }
}