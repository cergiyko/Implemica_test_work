package org.example.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void testFactNam() {
        assertEquals(648, Factorial.factNam(100));
        assertEquals(1, Factorial.factNam(0));
        assertEquals(1, Factorial.factNam(1));
        assertEquals(6, Factorial.factNam(3));

    }
}