package org.example;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> spList = new ArrayList<>();

    public boolean add(SanPham sp) {
        if (sp == null) {
            throw new IllegalArgumentException("san pham khong duoc null");
        }
        if (sp.getMa() == null || sp.getMa().isEmpty()) {
            throw new IllegalArgumentException("ma san pham khong duoc null");
        }
        if (sp.getSoLuong() < 1 || sp.getSoLuong() > 100) {
            throw new IllegalArgumentException("so luong san pham trong khoang 1 den 100");
        }
        for (SanPham sanPham : spList) {
            if (sanPham.getMa().equals(sp.getMa())) {
                throw new IllegalArgumentException("ma san pham da ton tai");
            }
        }
        return spList.add(sp);
    }
}
