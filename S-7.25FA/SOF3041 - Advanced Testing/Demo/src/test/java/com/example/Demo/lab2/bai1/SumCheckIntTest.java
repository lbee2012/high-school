package com.example.Demo.lab2.bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCheckIntTest {
    private SumCheckInt sci;

    @BeforeEach
    public void setup() {
        sci = new SumCheckInt();
    }

    @Test //thanh cong
    public void hoanHao() {
        Integer result = sci.sum("7", "8");
        Integer expected = 15;
        assertEquals(result, expected);
    }

    @Test
    public void abBienDuoi() {
        Integer result = sci.sum("4", "4");
        Integer expected = 8;
        assertEquals(result, expected);
    }

    @Test
    public void abBienTren() {
        Integer result = sci.sum("10", "10");
        Integer expected = 20;
        assertEquals(result, expected);
    }

    @Test
    public void aVuotTrenMax() {
        assertThrows(IllegalArgumentException.class, () -> sci.sum("15", "5"));
    }

    @Test
    public void aVuotDuoiMin() {
        assertThrows(IllegalArgumentException.class, () -> sci.sum("3", "5"));
    }

    @Test
    public void aString() {
        assertThrows(IllegalArgumentException.class, () -> sci.sum("Hello", "5"));
    }
}