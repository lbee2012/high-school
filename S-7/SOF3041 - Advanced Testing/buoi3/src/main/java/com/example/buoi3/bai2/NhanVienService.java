package com.example.buoi3.bai2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private ArrayList<NhanVien> nvList = new ArrayList<>();
    public boolean addNV(NhanVien nv) {
        if (nv.getTenNV() == null || nv.getTenNV().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten nhan vien khong duoc de trong");
        }
        if (nv.getTuoi() < 18 || nv.getTuoi() > 65) {
            throw new IllegalArgumentException("Tuoi nhan vien khong hop le");
        }
        if (nv.getLuong() < 0 || nv.getLuong() > 100000000) {
            throw new IllegalArgumentException("Luong khong duoc vuot qua quy dinh");
        }
        for (NhanVien existing : nvList) {
            if (existing.getMaNV().equals(nv.getMaNV())) {
                throw new IllegalArgumentException("Ma nhan vien da ton tai");
            }
        }
        nvList.add(nv);
        return true;
    }
    public List<NhanVien> findNhanVienByPhongBan(String phongBan) {
        List<NhanVien> result = new ArrayList<>();
        for (NhanVien nv : nvList) {
            if (nv.getPhongBan().equalsIgnoreCase(phongBan)) {
                result.add(nv);
            }
        }
        return result;
    }
}
