package com.example.ThiLan1.TH03115.repository;

import com.example.ThiLan1.TH03115.model.CapSach;
import com.example.ThiLan1.TH03115.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CapSachRepository {
    private Session s = null;

    public CapSachRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<CapSach> getAll() {
        return s.createQuery("FROM CapSach ").list();
    }

    public CapSach getOne(Integer id) {
        return s.find(CapSach.class, id);
    }

    public void search(String ten) {
//        Query query = s.find();
    }

    public void add(CapSach cs) {
        try {
            s.getTransaction().begin();
            s.save(cs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(CapSach cs) {
        try {
            s.getTransaction().begin();
            s.merge(cs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

//    public void delete(CapSach cs) {
//        try {
//            s.getTransaction().begin();
//            s.save(cs);
//            s.getTransaction().commit();
//        } catch (Exception e) {
//            s.getTransaction().rollback();
//            e.printStackTrace();
//        }
//    }
}
