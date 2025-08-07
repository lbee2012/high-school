package com.example.LuyenTapLan2.de1.repository;

import com.example.LuyenTapLan2.de1.model.SanPham;
import com.example.LuyenTapLan2.de1.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class    SanPhamRepo {
    private Session s = null;

    public SanPhamRepo() {
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

    public List<SanPham> searchByTen(String tenSP) {
        Query q = s.createQuery("FROM SanPham sp WHERE tenSP LIKE :tenSP");
        q.setParameter("tenSP", "%" + tenSP + "%");
        return q.list();
    }

    public List<SanPham> sortByGia() {
        Query q = s.createQuery("FROM SanPham sp ORDER BY sp.giaBan DESC ");
        return q.list();
    }

    public List<SanPham> pageBy5(int page, int pageSize) {
        Query q = s.createQuery("FROM SanPham ");
        q.setFirstResult(page * pageSize);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
