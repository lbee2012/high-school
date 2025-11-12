package com.example.LuyenTapLan2.de1.repository;

import com.example.LuyenTapLan2.de1.model.DanhMuc;
import com.example.LuyenTapLan2.de1.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class DanhMucRepo {
    private Session s = null;

    public DanhMucRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<DanhMuc> getAll() {
        return s.createQuery("FROM DanhMuc ").list();
    }

    public DanhMuc getOne(Integer id) {
        return s.find(DanhMuc.class, id);
    }
}
