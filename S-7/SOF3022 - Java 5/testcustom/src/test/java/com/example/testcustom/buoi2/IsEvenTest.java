package com.example.testcustom.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsEvenTest {
    BaiTapService bts;
    @BeforeEach
    void setUp() {
        bts = new BaiTapService();
    }
    @Test
    void so_am_throw() {
        assertThrows(IllegalArgumentException.class, () -> bts.isEven(-1));
    }
    @Test
    void so_0_ok() {
        boolean result = bts.isEven(0);
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void so_duong_odd_throw() {
        boolean result = bts.isEven(111);
        boolean expected = false;
        assertEquals(expected, result);
    }
    @Test
    void so_duong_even_ok() {
        boolean result = bts.isEven(100);
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void so_1_throw() {
        boolean result = bts.isEven(1);
        boolean expected = false;
        assertEquals(expected, result);
    }
}
