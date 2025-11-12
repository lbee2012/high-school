package com.example.Demo.onTap.phan1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhCongTLHTest {
    TrungBinhCongTLH tbc;
    @BeforeEach
    public void setup() {
        tbc = new TrungBinhCongTLH();
    }

    @Test
    void hoplyca3_ok() {
        double result = tbc.averager(5, 6, 7);
        double expected = 6;
        assertEquals(result, expected);
    }
    @Test
    void bienTren_ok() {
        double result = tbc.averager(10, 10, 10);
        double expected = 10;
        assertEquals(result, expected);
    }
    @Test
    void bienDuoi_ok() {
        double result = tbc.averager(0, 0, 0);
        double expected = 0;
        assertEquals(result, expected);
    }
    @Test
    void bienTren_throw() {
        assertThrows(IllegalArgumentException.class, () -> tbc.averager(11, 10, 9));
    }
    @Test
    void bienDuoi_throw() {
        assertThrows(IllegalArgumentException.class, () -> tbc.averager(10, 9, -1));
    }
}