package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    SanPhamService spService;
    @BeforeEach
    void setUp() {
        spService = new SanPhamService();
    }

    @Test
    void add_ok() {
        SanPham sp = new SanPham(1, "SP1", 1000f, 2020);
        boolean result = spService.add(sp);
        assertTrue(result);
    }
    @Test
    void add_throw() {
        SanPham sp = new SanPham(null, null, null, null);
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
    @Test
    void add_id_dub() {
        SanPham sp = new SanPham(1, "SP1", 1000f, 2020);
        SanPham sp1 = new SanPham(1, "SP1", 1000f, 2020);
        spService.add(sp);
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp1));
    }
    @Test
    void add_gia_invalid() {
        SanPham sp = new SanPham(1, "SP1", -1000f, 2020);
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
}