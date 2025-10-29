package com.example.testcustom.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class calculateAgeTest {
    BaiTapService bts;
    @BeforeEach
    void setup() {
        bts = new BaiTapService();
    }
    @Test
    void ok_2025_ok() {
        int result = bts.calculateAge(2024);
        int expected = 1;
        assertEquals(expected, result);
    }
    @Test
    void throw_2026_throw() {
        assertThrows(IllegalArgumentException.class, () -> bts.calculateAge(2026));
    }
    @Test
    void throw_1900_throw() {
        assertThrows(IllegalArgumentException.class, () -> bts.calculateAge(1900));
    }
}
