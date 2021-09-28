package ex29;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void isValid() {
        assertEquals(-1, Calculator.isValid("0"));
        assertEquals(0, Calculator.isValid("aa1"));
        assertEquals(18, Calculator.isValid("4"));
    }
}