package com.example.Demo.lab2.bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividationIntForZeroTest {
    private DividationIntForZero d;
    @BeforeEach
    public void setup() {
        d = new DividationIntForZero();
    }

    @Test
    public void hopLe() {
        int result = d.dividation(10, 2);
        int expect = 5;
        assertEquals(result, expect);
    }

    @Test
    public void dauAm() {
        int result = d.dividation(10, -2);
        int expect = -5;
        assertEquals(result, expect);
    }

    @Test
    public void bienChia() {
        int result = d.dividation(10, 1);
        int expect = 10;
        assertEquals(result, expect);
    }

    @Test
    public void zeroA() {
        int result = d.dividation(0, 2);
        int expect = 0;
        assertEquals(result, expect);
    }

    @Test
    public void zeroB() {
        assertThrows(IllegalArgumentException.class, () -> d.dividation(10, 0));
    }
}