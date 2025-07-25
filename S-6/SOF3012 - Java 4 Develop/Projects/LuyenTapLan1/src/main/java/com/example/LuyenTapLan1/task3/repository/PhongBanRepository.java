package com.example.LuyenTapLan1.task3.repository;

import com.example.LuyenTapLan1.task3.model.PhongBan;
import com.example.LuyenTapLan1.task3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class PhongBanRepository {
    private Session s = null;

    public PhongBanRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<PhongBan> getAll() {
        return s.createQuery("FROM PhongBan ").list();
    }

    public PhongBan getOne(Integer id) {
        return s.find(PhongBan.class, id);
    }
}
