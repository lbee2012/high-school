package com.example.LuyenTapLan1.task5.repository;

import com.example.LuyenTapLan1.task5.model.NguoiDung;
import com.example.LuyenTapLan1.task5.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class NguoiDungRepository {
    private Session s = null;

    public NguoiDungRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<NguoiDung> getAll() {
        return s.createQuery("FROM NguoiDung ").list();
    }

    public NguoiDung getOne(Integer id) {
        return s.find(NguoiDung.class, id);
    }

    public void add(NguoiDung nd) {
        try {
            s.getTransaction().begin();
            s.save(nd);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
        }
    }

    public void update(NguoiDung nd) {
        try {
            s.getTransaction().begin();
            s.merge(nd);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
    }
    }

    public void delete(Integer id) {
        try {
            s.getTransaction().begin();
            s.delete(this.getOne(id));
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
        }
    }
}
