package com.example.SD20205.buoi10.repository;

import com.example.SD20205.buoi10.model.BaiHat;
import com.example.SD20205.buoi10.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BaiHatRepository {
    private Session s = null;

    public BaiHatRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<BaiHat> getAll() {
        return s.createQuery("FROM BaiHat ").list();
    }

    public BaiHat getOne(Integer id) {
        return s.find(BaiHat.class, id);
    }

    public void add(BaiHat bh) {
        try {
            s.getTransaction().begin();
            s.save(bh);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(BaiHat bh) {
        try {
            s.getTransaction().begin();
            s.merge(bh);
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

    public List<BaiHat> searchByTen(String tenBaiHat) {
        Query q = s.createQuery("FROM BaiHat bh WHERE tenBaiHat LIKE :tenBaiHat");
        q.setParameter("tenBaiHat", "%" + tenBaiHat + "%");
        return q.list();
    }

    public List<BaiHat> sortByThoiLuong() {
        return s.createQuery("FROM BaiHat bh ORDER BY bh.thoiLuong DESC").list();
    }

    public List<BaiHat> page(int page, int pageSize) {
        Query q = s.createQuery("FROM BaiHat ");
        q.setFirstResult(page * pageSize);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
