package com.example.LuyenTapLan3.de3.repository;

import com.example.LuyenTapLan3.de3.model.LoaiSP;
import com.example.LuyenTapLan3.de3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class LoaiSPRepo {
    private Session s = null;

    public LoaiSPRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<LoaiSP> getAll() {
        return s.createQuery("FROM LoaiSP ").list();
    }

    public LoaiSP getOne(Integer id) {
        return s.find(LoaiSP.class, id);
    }
}
