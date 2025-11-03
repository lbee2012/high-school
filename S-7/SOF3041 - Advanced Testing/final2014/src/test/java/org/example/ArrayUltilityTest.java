package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayUltilityTest {
    ArrayUltility a;
    @BeforeEach
    void setUp() {
        a = new ArrayUltility();
    }

    @Test
    void sum_ok() {
        int result = a.sum(new int[]{1, 2, 3, 4, 5});
        int expected = 15;
        assertEquals(expected, result);
    }
    @Test
    void sum_throw() {
        int result = a.sum(new int[]{1, 2, 3, 4, 5});
        int unexpected = 20;
        assertNotEquals(unexpected, result);
    }
    @Test
    void sum_empty() {
        int result = a.sum(new int[]{});
        int expected = 0;
        assertEquals(expected, result);
    }
    @Test
    void sum_negative() {
        int result = a.sum(new int[]{-1, -2, -3, -4, -5});
        int expected = -15;
        assertEquals(expected, result);
    }
    @Test
    void sum_mixed() {
        int result = a.sum(new int[]{-1, 2, -3, 4, -5});
        int expected = -3;
        assertEquals(expected, result);
    }
}