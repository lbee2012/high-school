package com.example.testcustom.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivideTest {
    BaiTapService bts;
    @BeforeEach
    void setup() {
        bts = new BaiTapService();
    }
    @Test
    void test_10_chia_2_ok() {
        int result = bts.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result);
    }
    @Test
    void test_10_chia_am2_ok() {
        int result = bts.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result);
    }
    @Test
    void test_am10_chia_2_ok() {
        int result = bts.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result);
    }
    @Test
    void test_am10_chia_am2_ok() {
        int result = bts.divide(10, 2);
        int expected = 5;
        assertEquals(expected, result);
    }
    @Test
    void test_chia_cho0_throw() {
        assertThrows(ArithmeticException.class, () -> bts.divide(10, 0));
    }
}
