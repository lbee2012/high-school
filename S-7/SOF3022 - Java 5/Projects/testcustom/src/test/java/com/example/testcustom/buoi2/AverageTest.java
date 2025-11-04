package com.example.testcustom.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AverageTest {
    BaiTapService bts;
    @BeforeEach
    void setUp() {
        bts = new BaiTapService();
    }

    @Test
    void mang_rong_throw() {
        assertThrows(IllegalArgumentException.class, () -> bts.average(new int[] {}));
    }
    @Test
    void mang_co_pt_ok() {
        int[] arr = {1, 2, 3};
        double result = bts.average(arr);
        double expected = 2;
        assertEquals(expected, result);
    }
    @Test
    void mang_mix_pt_ok() {
        int[] arr = {-1, -3, 1, 3};
        double result = bts.average(arr);
        double expected = 0;
        assertEquals(expected, result);
    }
}
