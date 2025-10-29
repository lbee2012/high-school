package com.example.kiemtralan1.lan1.service;

import com.example.kiemtralan1.lan1.model.MayTinh;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MayTinhService {
    private List<MayTinh> mtList = new ArrayList<>();
    public MayTinhService() {
        mtList.add(new MayTinh(1, "abc123", 1234567.00, 2007, "maytinhbeo"));
        mtList.add(new MayTinh(2, "xyz456", 2345678.00, 2005, "maytinhgay"));
        mtList.add(new MayTinh(3, "def789", 3456789.00, 2010, "maytinhkhongbeo"));
        mtList.add(new MayTinh(4, "wrd012", 4567890.00, 2012, "maytinhkhonggay"));
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
}
