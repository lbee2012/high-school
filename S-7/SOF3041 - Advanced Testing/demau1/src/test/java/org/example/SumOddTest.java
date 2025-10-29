package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOddTest {
    SumOdd p;
    @BeforeEach
    void setup() {
        p = new SumOdd();
    }
    @Test
    void test_sum_ok() {
        int result = p.sumOdd();
        int expected = 250000;
        assertEquals(expected, result);
    }
    @Test
    void test_sum_notok() {
        int result = p.sumOdd();
        int unexpected = 2500;
        assertNotEquals(unexpected, result);
    }
//    3 more test cases?
    @Test
    void test_sum_greater_than_200000() {
        int result = p.sumOdd();
        assertTrue(result > 200000);
    }
    @Test
    void test_sum_less_than_300000() {
        int result = p.sumOdd();
        assertTrue(result < 300000);
    }
    @Test
    void test_sum_is_even() {
        int result = p.sumOdd();
        assertFalse(result % 2 != 0);
    }
}