package com.example.tutorsof3012.buoi1.repository;

import com.example.tutorsof3012.buoi1.model.SanPham;
import com.example.tutorsof3012.buoi1.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session s = null;

    public SanPhamRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<SanPham> getAll() {
        return s.createQuery("FROM SanPham ").list();
    }

    public SanPham getOne(Integer id) {
        return s.find(SanPham.class, id);
    }

    public void add(SanPham sp) {
        try {
            s.getTransaction().begin();
            s.save(sp);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(SanPham sp) {
        try {
            s.getTransaction().begin();
            s.merge(sp);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
        try {
            s.getTransaction().begin();
            s.delete(this.getOne(id));
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }


}
