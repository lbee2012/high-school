package org.example;

import java.util.ArrayList;
import java.util.List;

public class SachService {
    private List<Sach> sList = new ArrayList<>();

    public boolean updateSach(Sach sach) {
        if (sach.getMaSach() == null || sach.getMaSach().isEmpty()) {
            throw new IllegalArgumentException("Ma sach khong duoc de trong");
        }
        if (sach.getNamXuatBan() < 1990 || sach.getNamXuatBan() > 2025) {
            throw new IllegalArgumentException("Nam xuat ban phai trong khoang 1990 den 2025");
        }
        // Tim sach trong danh sach
        for (int i = 0; i < sList.size(); i++) {
            if (sList.get(i).getMaSach().equals(sach.getMaSach())) {
                sList.set(i, sach);
                return true;
            }
        }
        return false;
    }
}
