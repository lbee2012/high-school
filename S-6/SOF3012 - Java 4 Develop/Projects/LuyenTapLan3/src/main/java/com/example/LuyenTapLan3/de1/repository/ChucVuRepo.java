package com.example.LuyenTapLan3.de1.repository;

import com.example.LuyenTapLan3.HibernateConfig;
import com.example.LuyenTapLan3.de1.model.ChucVu;
import org.hibernate.Session;

import java.util.List;

public class ChucVuRepo {
    private Session s = null;

    public ChucVuRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<ChucVu> getAll() {
        return s.createQuery("FROM ChucVu ").list();
    }

    public ChucVu getOne(Integer id) {
        return s.find(ChucVu.class, id);
    }
}
