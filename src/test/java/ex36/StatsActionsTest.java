package ex36;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StatsActionsTest {
    @Test
    void isValid() {
        assertEquals(true, StatsActions.isValid("200"));
    }

    @Test
    void calculateAvg() {
        ArrayList list = new ArrayList();
        list.add(0, 4);
        list.add(1, 6);
        list.add(2, 8);
        assertEquals(6, StatsActions.calculateAvg(list));
    }

    @Test
    void getMin() {
        ArrayList list = new ArrayList();
        list.add(0, 4);
        list.add(1, 6);
        list.add(2, 8);
        assertEquals(4, StatsActions.getMin(list));
    }

    @Test
    void getMax() {
        ArrayList list = new ArrayList();
        list.add(0, 4);
        list.add(1, 6);
        list.add(2, 8);
        assertEquals(8, StatsActions.getMax(list));
    }

    @Test
    void getStdDev() {
        ArrayList list = new ArrayList();
        list.add(0, 4);
        list.add(1, 6);
        list.add(2, 9);
        assertEquals(2.05, StatsActions.getStdDev(list));
    }
}