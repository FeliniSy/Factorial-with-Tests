package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    public void testFactorialTen() {
        assertEquals("3628800", factorial.factorial("10"));
    }

    @Test
    public void testFactorialZero() {
        assertEquals("1", factorial.factorial("0"));
    }

    @Test
    public void testFactorialEdgeCaseIntegerMax() {
        assertEquals("479001600", factorial.factorial("12"));
    }
}
