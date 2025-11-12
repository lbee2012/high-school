package com.example.LuyenTapLan1.task1.repository;

import com.example.LuyenTapLan1.task1.model.PhanLoai;
import com.example.LuyenTapLan1.task1.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class PhanLoaiRepository {
    private Session session = null;

    public PhanLoaiRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<PhanLoai> getAll() {
        return session.createQuery("FROM PhanLoai ").list();
    }

    public PhanLoai getOne(Integer id) {
        return session.find(PhanLoai.class, id);
    }
}
