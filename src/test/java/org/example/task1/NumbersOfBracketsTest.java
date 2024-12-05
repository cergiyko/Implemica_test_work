package org.example.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersOfBracketsTest {

    @Test
    void testDetermineTheNumber() {
        assertEquals(1,NumbersOfBrackets.determineTheNumber(0));
        assertEquals(1,NumbersOfBrackets.determineTheNumber(1));
        assertEquals(2,NumbersOfBrackets.determineTheNumber(2));
        assertEquals(5,NumbersOfBrackets.determineTheNumber(3));
        assertEquals(14,NumbersOfBrackets.determineTheNumber(4));
    }
}