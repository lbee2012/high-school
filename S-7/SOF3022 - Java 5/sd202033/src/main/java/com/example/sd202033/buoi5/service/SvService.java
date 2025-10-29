package com.example.sd202033.buoi5.service;

import com.example.sd202033.buoi5.model.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class SvService {
    private List<SinhVien> svList = null;
    public SvService() {
        svList = new ArrayList(Arrays.asList(
            new SinhVien(1, "Hoang Quy Long", 5f, true),
            new SinhVien(2, "Quy Long Hoang", 6f, false),
            new SinhVien(3, "Hoang Long Quy", 7f, true),
            new SinhVien(4, "Long Quy Hoang", 8f, false)
        ));
    }

    public List<SinhVien> getAll() {
        return svList;
    }

    public SinhVien getOne(Integer id) {
        for(SinhVien sv : svList) {
            if(sv.getId() == id) {
                return sv;
            }
        }
        return null;
    }

    public void addSV(SinhVien sv) {
        svList.add(sv);
    }
    public void updateSV(SinhVien sv) {
        int updateIndex = -1;
        for(int i = 0; i < svList.size(); i++) {
            if(sv.getId() == svList.get(i).getId()) {
                updateIndex = i;
            }
        }
        svList.set(updateIndex, sv);
    }
    public void deleteSV(Integer id) {
        svList.removeIf(sv -> sv.getId() == id);
    }
}
