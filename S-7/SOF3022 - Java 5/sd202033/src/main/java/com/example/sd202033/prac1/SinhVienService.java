package com.example.sd202033.prac1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class SinhVienService {
    private List<SinhVien> svList = new ArrayList<>();
    public SinhVienService() {
        svList.add(new SinhVien(1, "Long", 18, true, "SD203", "TH03115"));
        svList.add(new SinhVien(2, "Logn", 18, true, "SD203", "TH03115"));
        svList.add(new SinhVien(3, "Lnog", 18, true, "SD203", "TH03115"));
        svList.add(new SinhVien(4, "Lgon", 18, true, "SD203", "TH03115"));
        svList.add(new SinhVien(5, "Lgno", 18, true, "SD203", "TH03115"));
    }
    public List<SinhVien> getAll() {
        return svList;
    }
    public SinhVien getOne(Integer id) {
        for (SinhVien sv : svList) {
            if (sv.getId() == id) {
                return sv;
            }
        }
        return null;
    }
    public void addSV(SinhVien sv) {
        svList.add(sv);
    }
    public void updateSV(SinhVien sv) {
        int index = -1;
        for (int i = 0; i < svList.size(); i++) {
            if (sv.getId() == svList.get(i).getId()) {
                i = index;
            }
        }
        svList.set(index, sv);
    }
    public void delSV(Integer id) {
        svList.removeIf(sv -> sv.getId() == id);
    }
    public List<SinhVien> searchSV(String ten) {
        List<SinhVien> result = new ArrayList<>();
        for (SinhVien sv : svList) {
            if (sv.getTen().equals(ten)) {
                result.add(sv);
            }
        }
        return result; //neu khong co ai thi result cung = 0
    }
}
