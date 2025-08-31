package com.epam.rd.autotasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCsvParametrizedTesting {

    Factorial factorial = new Factorial();

    @ParameterizedTest
    @CsvFileSource(resources = "/csvCases.csv")
    void testFactorial(String input, String output) {
        try {
            int expected = Integer.parseInt(output);
            assertEquals(expected, factorial.factorial(input));
        } catch (NumberFormatException e) {
            assertThrows(NumberFormatException.class, () -> factorial.factorial(input));
        } catch (IllegalArgumentException e) {
            assertThrows(IllegalArgumentException.class, () -> factorial.factorial(input));
        }
    }
}
