package com.example.SD20205.buoi13_preTest.repository;

import com.example.SD20205.buoi13_preTest.model.HocSinh;
import com.example.SD20205.buoi13_preTest.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HocSinhRepository {
    private Session s = null;

    public HocSinhRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<HocSinh> getAll() {
        return s.createQuery("FROM HocSinh ").list();
    }

    public HocSinh getOne(Integer id) {
        return s.find(HocSinh.class, id);
    }

    public void add(HocSinh hs) {
        try {
            s.getTransaction().begin();
            s.save(hs);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(HocSinh hs) {
        try {
            s.getTransaction().begin();
            s.merge(hs);
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

    public List<HocSinh> searchByTen(String tenHocSinh) {
        Query q = s.createQuery("FROM HocSinh WHERE tenHocSinh LIKE :tenHocSinh");
        q.setParameter("tenHocSinh", "%" + tenHocSinh + "%");
        return q.list();
    }

    public List<HocSinh> sortByTuoi() {
        return s.createQuery("FROM HocSinh hs ORDER BY hs.tuoi DESC").list();
    }

    public List<HocSinh> paging(int page, int pageSize) {
        Query q = s.createQuery("FROM HocSinh ");
        q.setFirstResult(page * pageSize);
        q.setMaxResults(pageSize);
        return q.list();
    }
}