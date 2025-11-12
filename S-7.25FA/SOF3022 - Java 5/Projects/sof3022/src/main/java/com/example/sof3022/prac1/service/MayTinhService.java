package com.example.sof3022.prac1.service;

import com.example.sof3022.prac1.model.MayTinh;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MayTinhService {
    private List<MayTinh> mtList = new ArrayList<>();
    public MayTinhService() {
        mtList.add(new MayTinh(1, "Asus", true, true));
        mtList.add(new MayTinh(2, "Acer", false, false));
        mtList.add(new MayTinh(3, "MSI", false, true));
    }
    public List<MayTinh> getAll() {
        return mtList;
    }
    public MayTinh getOne(Integer id) {
        for (MayTinh mt : mtList) {
            if (mt.getId() == id) {
                return mt;
            }
        }
        return null;
    }
    public void addMT(MayTinh mt) {
        mtList.add(mt);
    }
    public void updateMT(MayTinh mt) {
        int index = -1;
        for (int i = 0; i < mtList.size(); i++) {
            if (mt.getId() == mtList.get(i).getId()) {
                index = i;
            }
        }
        mtList.set(index, mt);
    }
    public void deleteMT(Integer id) {
        mtList.removeIf(mt -> mt.getId() == id);
    }
}
