/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */
package ex24;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @org.junit.jupiter.api.Test
    void isAnagram() {
        assertEquals(true, App.isAnagram("tone", "note"));
        assertEquals(true, App.isAnagram("Tone", "Note"));
        assertEquals(false, App.isAnagram("tone", "nate"));
    }
}