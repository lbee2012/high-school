package com.example.buoi3.bai2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nvs;
    @BeforeEach
    void setUp() {
        nvs = new NhanVienService();
    }
    @Test
    void test_validNV_true() {
        NhanVien nv = new NhanVien("NV01", "Nguyen Van A", 30, 15000000.0, "IT");
        assertTrue(nvs.addNV(nv));
    }
    @Test
    void test_invalidName_throw() {
        NhanVien nv = new NhanVien("NV02", "", 20, 15000000.0, "GD");
        assertThrows(IllegalArgumentException.class, () -> nvs.addNV(nv));
    }
    @Test
    void test_invalidAge_throw() {
        NhanVien nv = new NhanVien("NV03", "Le Thi B", 17, 15000000.0, "KT");
        assertThrows(IllegalArgumentException.class, () -> nvs.addNV(nv));
    }
    @Test
    void test_findByPhongBan_success() {
        NhanVien nv1 = new NhanVien("NV05", "Pham Thi D", 28, 20000000.0, "IT");
        NhanVien nv2 = new NhanVien("NV06", "Hoang Van E", 35, 25000000.0, "IT");
        NhanVien nv3 = new NhanVien("NV07", "Vu Thi F", 40, 30000000.0, "KT");
        nvs.addNV(nv1);
        nvs.addNV(nv2);
        nvs.addNV(nv3);
        assertEquals(2, nvs.findNhanVienByPhongBan("IT").size());
    }
    @Test
    void test_findByPhongBan_noResult() {
        NhanVien nv1 = new NhanVien("NV08", "Tran Van G", 29, 18000000.0, "HC");
        nvs.addNV(nv1);
        assertEquals(0, nvs.findNhanVienByPhongBan("KT").size());
    }
}