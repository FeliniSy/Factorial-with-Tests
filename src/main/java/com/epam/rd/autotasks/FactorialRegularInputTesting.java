package com.epam.rd.autotasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialRegularInputTesting {

    Factorial factorial = new Factorial();

    @Test
    public void testFactorialZero() {
        assertEquals("1", factorial.factorial("0"));
    }

    @Test
    public void testFactorialOne() {
        assertEquals("1", factorial.factorial("1"));
    }

    @Test
    public void testFactorialThree() {
        assertEquals("6", factorial.factorial("3"));
    }

    @Test
    public void testFactorialFour() {
        assertEquals("24", factorial.factorial("4"));
    }

    @Test
    public void testFactorialSix() {
        assertEquals("720", factorial.factorial("6"));
    }

    @Test
    public void testFactorialSeven() {
        assertEquals("5040", factorial.factorial("7"));
    }

    @Test
    public void testFactorialTen() {
        assertEquals("3628800", factorial.factorial("10"));
    }
}