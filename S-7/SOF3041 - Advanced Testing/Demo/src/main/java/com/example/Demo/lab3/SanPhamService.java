package com.example.Demo.lab3;

import java.util.List;

public class SanPhamService {
    private List<SanPham> spList = null;
    public SanPhamService() {
        spList.add(new SanPham(1, "sp01", "ten01", 1f, "S", 1));
        spList.add(new SanPham(2, "sp02", "ten02", 2f, "M", 2));
        spList.add(new SanPham(3, "sp03", "ten03", 3f, "L", 3));
    }
    public List<SanPham> getAll() {
        return spList;
    }
    public SanPham getOne(Integer id) {
        for (SanPham sp : spList) {
            if(sp.getId() == id) {
                return sp;
            }
        }
        return null;
    }
    public void addSP(SanPham sp) {
        if (sp.getSoLuong() <= 0 || sp.getSoLuong() >= 100) {
            throw new IllegalArgumentException("So luong phai la so Nguyen duong va < 100");
        } else {
            spList.add(sp);
        }
    }
    public void updateSP(SanPham sp) {
        int updateIndex = -1;
        for(int i = 0; i < spList.size(); i++) {
            if(sp.getId() == spList.get(i).getId()) {
                updateIndex = i;
            }
        }
        spList.set(updateIndex, sp);
    }
    public void deleteSV(Integer id) {
        spList.removeIf(sp -> sp.getId() == id);
    }
}
