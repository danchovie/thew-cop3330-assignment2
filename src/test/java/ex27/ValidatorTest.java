package ex27;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void valid_first() {
        assertEquals("Jason", Validator.valid_first("Jason"));
        assertEquals("The first name must be filled in.", Validator.valid_first(""));
        assertEquals("The first name must be at least 2 characters long.", Validator.valid_first("3"));
    }

    @Test
    void valid_last() {
        assertEquals("Vorhees", Validator.valid_last("Vorhees"));
        assertEquals("The last name must be filled in.", Validator.valid_last(""));
        assertEquals("The last name must be at least 2 characters long.", Validator.valid_last("3"));
    }

    @Test
    void valid_ID() {
        assertEquals("AA-1234", Validator.valid_ID("AA-1234"));
        assertEquals("The employee ID must be in the format of AA-1234.", Validator.valid_ID("1B:A234"));
    }

    @Test
    void valid_zip() {
        assertEquals("32816", Validator.valid_zip("32816"));
        assertEquals("The zipcode must be a 5 digit number.", Validator.valid_zip("qq555"));
    }

    @Test
    void validateInput(){
        assertEquals("The first name must be filled in.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zipcode must be a 5 digit number.", Validator.validateInput("", "3", "AA216", "1B:5Q5"));
        assertEquals("Jason\n" +
                "Vorhees\n" +
                "AA-1234\n" +
                "32816", Validator.validateInput("Jason", "Vorhees", "AA-1234", "32816"));
    }
}