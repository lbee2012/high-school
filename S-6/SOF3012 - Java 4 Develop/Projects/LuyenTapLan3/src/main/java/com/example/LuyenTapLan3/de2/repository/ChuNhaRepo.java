package com.example.LuyenTapLan3.de2.repository;

import com.example.LuyenTapLan3.de2.model.ChuNha;
import com.example.LuyenTapLan3.de2.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class ChuNhaRepo {
    private Session s = null;

    public ChuNhaRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<ChuNha> getAll() {
        return s.createQuery("FROM ChuNha ").list();
    }

    public ChuNha getOne(Integer id) {
        return s.find(ChuNha.class, id);
    }
}
