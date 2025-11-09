package com.example.MayConChuotBeo.repository;

import com.example.MayConChuotBeo.model.ChuotBeo;
import com.example.MayConChuotBeo.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class ChuotBeoRepository {
    private Session session = null;

    public ChuotBeoRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<ChuotBeo> getAll() {
        return session.createQuery("FROM chuot_gaming").list();
    }

    public ChuotBeo getOne (Integer id) {
        return session.find(ChuotBeo.class, id);
    }

    public void them(ChuotBeo cb) {
        try {
            session.getTransaction().begin();
            session.save(cb);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
