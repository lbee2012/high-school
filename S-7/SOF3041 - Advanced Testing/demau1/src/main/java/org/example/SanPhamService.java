package org.example;

import java.util.ArrayList;

public class SanPhamService {
    private ArrayList<SanPham> spList = new ArrayList<>();
    public void addSP(SanPham sp) {
        if (sp == null) {
            throw new IllegalArgumentException("san pham khong duoc null");
        }
        if (sp.getSoLuong() < 1 || sp.getSoLuong() > 100) {
            throw new IllegalArgumentException("so luong phai trong khoang tu 1 den 100");
        }
        for (SanPham sanPham : spList) {
            if (sanPham.getMa().equals(sp.getMa())) {
                throw new IllegalArgumentException("ma san pham da ton tai");
            }
        }
        spList.add(sp);
    }
}
