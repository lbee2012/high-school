package com.example.LuyenTapLan2.de2.repository;

import com.example.LuyenTapLan2.de2.model.GiaoVien;
import com.example.LuyenTapLan2.de2.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class GiaoVienRepo {
    private Session s = null;

    public GiaoVienRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<GiaoVien> getAll() {
        return s.createQuery("FROM GiaoVien ").list();
    }

    public GiaoVien getOne(Integer id) {
        return s.find(GiaoVien.class, id);
    }
}
