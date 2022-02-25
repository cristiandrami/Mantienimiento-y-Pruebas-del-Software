package org.mps2022.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * factorial 0 -> 1 *
 * factorial 1 -> 1 *
 * factorial 2 -> 2 *
 * factorial 3 -> 6 *
 * factorial 6 -> 720 *
 * factorial negative number  -> Throw new RuntimeException
 */

class FactorialTest {

    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero() {
        var factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        var factorial = new Factorial();
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsTwo() {
        var factorial = new Factorial();
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnSixIfTheNumberIsThree() {
        var factorial = new Factorial();
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturn720IfTheNumberIs6() {
        var factorial = new Factorial();
        int expectedValue = 720;
        int obtainedValue = factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeOfNegativeNumberRaiseAnException() {
        var factorial = new Factorial();
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }

}