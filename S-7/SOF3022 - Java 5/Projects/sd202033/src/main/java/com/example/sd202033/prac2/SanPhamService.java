package com.example.sd202033.prac2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SanPhamService {
    private List<SanPham> spList = new ArrayList<>();
    public SanPhamService() {
        spList.add(new SanPham(1, "sp1", "a", 100, true));
        spList.add(new SanPham(2, "sp2", "b", 200, false));
        spList.add(new SanPham(3, "sp3", "c", 300, true));
        spList.add(new SanPham(4, "sp4", "d", 400, false));
        spList.add(new SanPham(5, "sp5", "e", 500, true));
    }
    public List<SanPham> getAll() {
        return spList;
    }
    public SanPham getOne(Integer id) {
        for (SanPham sp : spList) {
            if (sp.getId() == id) {
                return sp;
            }
        }
        return null;
    }
    public void addSP(SanPham sp) {
        spList.add(sp);
    }
    public void updateSP(SanPham sp) {
        int index = -1;
        for (int i = 0; i < spList.size(); i++) {
            if (sp.getId() == spList.get(i).getId()) {
                index = i;
            }
        }
        spList.set(index, sp);
    }
    public void deleteSP(Integer id) {
        spList.removeIf(sp -> sp.getId() == id);
    }
}
