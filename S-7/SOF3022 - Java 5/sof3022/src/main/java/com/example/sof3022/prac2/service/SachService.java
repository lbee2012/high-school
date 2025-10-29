package com.example.sof3022.prac2.service;

import com.example.sof3022.prac2.model.Sach;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SachService {
    private List<Sach> sList = new ArrayList<>();
    public SachService() {
        sList.add(new Sach(1, "tg1", "s1", 100, "nxb1"));
        sList.add(new Sach(2, "tg2", "s2", 200, "nxb2"));
        sList.add(new Sach(3, "tg3", "s3", 300, "nxb3"));
    }
    public List<Sach> getAll() {
        return sList;
    }
    public Sach getOne(Integer id) {
        for (Sach s : sList) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
    public void addS(Sach s) {
        sList.add(s);
    }
    public void updateS(Sach s) {
        int index = -1;
        for (int i = 0; i < sList.size(); i++) {
            if (s.getId() == sList.get(i).getId()) {
                index = i;
            }
        }
        sList.set(index, s);
    }
    public void deleteS(Integer id) {
        sList.removeIf(s -> s.getId() == id);
    }
}
