package com.example.LuyenTapLan2.de3.repository;

import com.example.LuyenTapLan2.de3.model.TheLoai;
import com.example.LuyenTapLan2.de3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class TheLoaiRepository {
    private Session s = null;

    public TheLoaiRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<TheLoai> getAll() {
        return s.createQuery("FROM TheLoai ").list();
    }

    public TheLoai getOne(Integer id) {
        return s.find(TheLoai.class, id);
    }
}
