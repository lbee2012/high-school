package com.example.SD20205.buoi10.repository;

import com.example.SD20205.buoi10.model.CaSi;
import com.example.SD20205.buoi10.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class CaSiRepository {
    private Session s = null;

    public CaSiRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<CaSi> getAll() {
        return s.createQuery("FROM CaSi ").list();
    }

    public CaSi getOne(Integer id) {
        return s.find(CaSi.class, id);
    }
}
