package ex34;/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniel Thew
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeActionsTest {

    @Test
    void updateEmployees() {
        String arr[] = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String arr2[] = {"John Smith", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        assertArrayEquals(arr2, EmployeeActions.updateEmployees("Jackie Jackson", arr));
    }
}