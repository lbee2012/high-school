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
    void add_sanPham_ok() {
        SanPham sp = new SanPham("SP001", "San Pham 1", 12, 100000f, 10, "Dien Thoai");
        assertTrue(spService.add(sp));
    }

    @Test
    void add_sanPham_ma_null_throw() {
        SanPham sp = new SanPham(null, "San Pham 1", 12, 100000f, 10, "Dien Thoai");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }

    @Test
    void add_sanPham_soLuong_0_throw() {
        SanPham sp = new SanPham("SP002", "San Pham 2", 12, 150000f, 0, "Laptop");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
    @Test
    void add_sanPham_soLuong_101_throw() {
        SanPham sp = new SanPham("SP003", "San Pham 3", 12, 200000f, 101, "Tablet");
        assertThrows(IllegalArgumentException.class, () -> spService.add(sp));
    }
    @Test
    void add_sanPham_dupMa_throw() {
        SanPham spA = new SanPham("SP004", "San Pham 4", 12, 250000f, 20, "Dien Thoai");
        SanPham spB = new SanPham("SP004", "San Pham 5", 12, 300000f, 15, "Laptop");
        spService.add(spA);
        assertThrows(IllegalArgumentException.class, () -> spService.add(spB));
    }
}