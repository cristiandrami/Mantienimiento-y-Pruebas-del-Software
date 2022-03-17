package org.mps2022.factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import java.time.Duration;

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

    private Factorial factorial;
    // to set what i need i can use beforeEach
    @BeforeEach
    public void setup(){
        factorial= new Factorial();

    }



    //this is the annotation I didn't know before reading the documentation
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5})
    public void shouldComputeOfTwoThreeFiveHasToBeMoreThan1(int value){
        assertTrue(factorial.compute(value)>1);
    }

    //this is the assertion I didn't know before reading the documentation
    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5, 10 })
    public void shouldComputeOfTwoThreeFiveTenTwentyIsExecutedInLessThan100Milliseconds(int value) {
        assertTimeout(Duration.ofMillis(100), () -> factorial.compute(value));
    }


    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero() {
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsTwo() {
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnSixIfTheNumberIsThree() {
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturn720IfTheNumberIs6() {
        int expectedValue = 720;
        int obtainedValue = factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeOfNegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }

}