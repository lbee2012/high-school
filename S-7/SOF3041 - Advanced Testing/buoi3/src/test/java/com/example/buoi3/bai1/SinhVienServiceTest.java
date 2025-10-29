package com.example.buoi3.bai1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
    SinhVienService svs;
    @BeforeEach
    void setUp() {
        svs = new SinhVienService();
    }
    @Test
    void testAddValidSinhVien() {
        SinhVien sv = new SinhVien("1", "Nguyen Van A", 8.5, "CTK42", 20);
        assertTrue(svs.add(sv));
    }
    @Test
    void testAddSinhVienWithEmptyName() {
        SinhVien sv = new SinhVien("2", "", 7.0, "CTK42", 22);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> svs.add(sv));
        assertEquals("Ten khong duoc de trong", exception.getMessage());
    }
    @Test
    void testAddSinhVienWithInvalidAge() {
        SinhVien sv = new SinhVien("3", "Le Thi B", 6.0, "CTK42", 17);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> svs.add(sv));
        assertEquals("Tuoi khong dung quy dinh", exception.getMessage());
    }
    @Test
    void testAddSinhVienWithInvalidScore() {
        SinhVien sv = new SinhVien("4", "Tran Van C", 11.0, "CTK42", 21);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> svs.add(sv));
        assertEquals("Diem khong hop ly", exception.getMessage());
    }
    @Test
    void testUpdateValidSinhVien() {
        SinhVien sv = new SinhVien("5", "Pham Thi D", 9.0, "CTK42", 23);
        svs.add(sv);
        assertTrue(svs.update("5", "Pham Thi E", 8.0));
    }
}