package com.example.LuyenTapLan1.task1.repository;

import com.example.LuyenTapLan1.task1.model.SanPham;
import com.example.LuyenTapLan1.task1.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session session = null;

    public SanPhamRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<SanPham> getAll() {
        return session.createQuery("FROM SanPham ").list();
    }

    public SanPham getOne(Integer id) {
        return session.find(SanPham.class, id);
    }

    public void add(SanPham sp) {
        try {
            session.getTransaction().begin();
            session.save(sp);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(SanPham sp) {
        try {
            session.getTransaction().begin();
            session.merge(sp);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getOne(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
