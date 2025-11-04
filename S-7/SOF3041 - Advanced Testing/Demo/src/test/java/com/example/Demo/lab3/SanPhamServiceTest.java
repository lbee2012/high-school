package com.example.Demo.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    SanPhamService sps;
    @BeforeEach
    public void setup() {
        sps = new SanPhamService();
    }

    @Test
    public void hopLy() {
        int initSize = sps.getAll().size();
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", 40);
        sps.addSP(sp);
        assertEquals(initSize + 1, sps.getAll().size());
    }

    @Test
    public void bienMin1() {
        int initSize = sps.getAll().size();
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", 1);
        sps.addSP(sp);
        assertEquals(initSize + 1, sps.getAll().size());
    }

    @Test
    public void bienMax99() {
        int initSize = sps.getAll().size();
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", 99);
        sps.addSP(sp);
        assertEquals(initSize + 1, sps.getAll().size());
    }

    @Test
    public void bienMin0() {
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", 0);
        sps.addSP(sp);
        assertThrows(IllegalArgumentException.class, () -> sps.addSP(sp));
    }

    @Test
    public void bienMax100() {
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", 100);
        sps.addSP(sp);
    }

    @Test
    public void bienMin_1() {
        SanPham sp = new SanPham(1, "sp01", "ten01", 1f, "S", -1);
        assertThrows(IllegalArgumentException.class, () -> sps.addSP(sp));
    }
}