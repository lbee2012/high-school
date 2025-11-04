package com.example.buoi3.bai1;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private ArrayList<SinhVien> svList = new ArrayList<>();
    public boolean add(SinhVien sv) {
        if (sv.getTen() == null || sv.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        if (sv.getTuoi() < 18 || sv.getTuoi() > 30) {
            throw new IllegalArgumentException("Tuoi khong dung quy dinh");
        }
        if (sv.getDiem() < 0 || sv.getDiem() > 10) {
            throw new IllegalArgumentException("Diem khong hop ly");
        }
        for (SinhVien existing : svList) {
            if (existing.getId().equals(existing.getId())) {
                throw new IllegalArgumentException("ID da ton tai");
            }
        }
        svList.add(sv);
        return true;
    }
    public boolean update(String id, String tenMoi, Double diemMoi) {
        for (SinhVien sv : svList) {
            if (sv.getId().equals(id)) {
                if (tenMoi == null || tenMoi.trim().isEmpty()) {
                    throw new IllegalArgumentException("Ten khong duoc de trong");
                }
                if (diemMoi < 0 || diemMoi > 10) {
                    throw new IllegalArgumentException("Diem khong hop ly");
                }

                sv.setTen(tenMoi);
                sv.setDiem(diemMoi);
                return true;
            }
        }
        throw new IllegalArgumentException("Khong tim thay sinh vien voi ID: " + id);
    }
}
