package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {
    SumOdd sum;
    @BeforeEach
    void setUp() {
        sum = new SumOdd();
    }
    @Test
    void test_sumodd_ok() {
        int result = sum.sumOdd();
        int expected = 250000;
        assertEquals(expected, result);
    }
    @Test
    void test_sumodd_notOk() {
        int result = sum.sumOdd();
        int expected = 249999;
        assertNotEquals(expected, result);
    }
    @Test
    void test_sumodd_greaterThan() {
        int result = sum.sumOdd();
        int expected = 200000;
        assertTrue(result > expected);
    }
    @Test
    void test_sumodd_lessThan() {
        int result = sum.sumOdd();
        int expected = 300000;
        assertTrue(result < expected);
    }
    @Test
    void test_sumodd_greaterThanOrEqualTo() {
        int result = sum.sumOdd();
        int expected = 200000;
        assertTrue(result >= expected);
    }
}