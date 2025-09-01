package com.epam.rd.autotasks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class FactorialBadInputTesting {

    Factorial factorial = new Factorial();

    @Test
    void testNullInput(){
        assertThrows(NumberFormatException.class, () -> {
            factorial.factorial(null);
        });

    }

    @Test
    void testNegativeInput(){
        assertThrows(IllegalArgumentException.class, () -> {factorial.factorial("-5");});
    }

    @Test
    void testFractionalInput(){
        assertThrows(NumberFormatException.class, () -> {factorial.factorial("3.5");});
    }

    @Test
    void testNonDigitalInput(){
        assertThrows(NumberFormatException.class, () -> {factorial.factorial("ajdh");});

    }
}
