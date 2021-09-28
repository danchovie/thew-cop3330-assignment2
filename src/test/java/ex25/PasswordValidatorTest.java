/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */
package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void strength_indicator() {
        assertEquals(1, PasswordValidator.strength_indicator("12345"));
        assertEquals(2, PasswordValidator.strength_indicator("abcde"));
        assertEquals(3, PasswordValidator.strength_indicator("abc123d4"));
        assertEquals(4, PasswordValidator.strength_indicator("abc123$$"));
        assertEquals(5, PasswordValidator.strength_indicator("12345678"));
        assertEquals(6, PasswordValidator.strength_indicator("abcdefgh"));
        assertEquals(7, PasswordValidator.strength_indicator("abc123"));
        assertEquals(8, PasswordValidator.strength_indicator("ab12$^"));
    }
}