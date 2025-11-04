package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNguyenDuong1Den100Test {
    CheckNguyenDuong1Den100 test;
    @BeforeEach
    void setUp() {
        test = new CheckNguyenDuong1Den100();
    }

    @Test
    void isNguyenDuong1Den100_ok() {
        assertTrue(test.isCheck(50));
    }
    @Test
    void isNguyenDuong1Den100_throw() {
        assertFalse(test.isCheck(500));
    }
    @Test
    void isNguyenDuong1Den100_min() {
        assertTrue(test.isCheck(1));
    }
    @Test
    void isNguyenDuong1Den100_max() {
        assertTrue(test.isCheck(100));
    }
    @Test
    void isNguyenDuong1Den100_0() {
        assertFalse(test.isCheck(0));
    }
}