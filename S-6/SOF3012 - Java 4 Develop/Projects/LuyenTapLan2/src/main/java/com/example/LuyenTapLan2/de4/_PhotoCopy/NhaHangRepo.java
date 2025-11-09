package com.example.LuyenTapLan2.de4.repository;

import com.example.LuyenTapLan2.de4.model.NhaHang;
import com.example.LuyenTapLan2.de4.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class NhaHangRepo {
    private Session s = null;

    public NhaHangRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<NhaHang> getAll() {
        return s.createQuery("FROM NhaHang ").list();
    }

    public NhaHang getOne(Integer id) {
        return s.find(NhaHang.class, id);
    }
}
