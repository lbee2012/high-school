package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    SachService ss;
    @BeforeEach
    void setUp() {
        ss = new SachService();
    }
    @Test
    void update_sach_null() {
         Sach sach = new Sach(null, "Java", "Nguyen Van A", 2020, 150000f);
        assertThrows(IllegalArgumentException.class, () -> ss.updateSach(sach));
    }
    @Test
    void update_namXuatBan_ok() {
        Sach sach = new Sach("S001", "Java", "Nguyen Van A", 2020, 150000f);
        assertDoesNotThrow(() -> ss.updateSach(sach));
    }
    @Test
    void update_namXuatBan_throw() {
        Sach sach = new Sach("S001", "Java", "Nguyen Van A", 0000, 150000f);
        assertThrows(IllegalArgumentException.class, () -> ss.updateSach(sach));
    }
    @Test
    void update_namXuatBan_1990min() {
        Sach sach = new Sach("S001", "Java", "Nguyen Van A", 1990, 150000f);
        assertDoesNotThrow(() -> ss.updateSach(sach));
    }
    @Test
    void update_namXuatBan_2025max() {
        Sach sach = new Sach("S001", "Java", "Nguyen Van A", 2025, 150000f);
        assertDoesNotThrow(() -> ss.updateSach(sach));
    }
}