package com.example.SD20205.buoi13_preTest.repository;

import com.example.SD20205.buoi13_preTest.model.TruongHoc;
import com.example.SD20205.buoi13_preTest.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class TruongHocRepository {
    private Session s = null;

    public TruongHocRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<TruongHoc> getAll() {
        return s.createQuery("FROM TruongHoc ").list();
    }

    public TruongHoc getOne(Integer id) {
        return s.find(TruongHoc.class, id);
    }
}
