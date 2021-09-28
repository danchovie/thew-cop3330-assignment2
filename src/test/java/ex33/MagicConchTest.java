package ex33;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicConchTest {

    @Test
    void ohMagicConch() {
        assertEquals("Yes.", MagicConch.ohMagicConch(0));
    }
}