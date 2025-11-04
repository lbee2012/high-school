package org.example;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> spList = new ArrayList<>();
    public boolean add(SanPham sp) {
        if (sp == null) {
            throw new IllegalArgumentException("sp khong dc null");
        }
        if (sp.getId() == null || sp.getTen() == null || sp.getGia() == null || sp.getNamSX() == null) {
            throw new IllegalArgumentException("cac truong khong dc null");
        }
        if (sp.getGia() <= 0) {
            throw new IllegalArgumentException("sp.gia phai lon hon 0");
        }
        for (SanPham sp1 : spList) {
            if (sp1.getId().equals(sp.getId())) {
                throw new IllegalArgumentException("sp.id da ton tai");
            }
        }
        return spList.add(sp);
    }
}
