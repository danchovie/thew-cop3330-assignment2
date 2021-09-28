package ex35;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayActionsTest {

    @Test
    void randomWinner() {
        ArrayList list = new ArrayList();
        list.add(0, "John");
        list.add(1, "Amy");
        assertEquals("John", ArrayActions.randomWinner(0, list));
    }
}