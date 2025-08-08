package com.example.LuyenTapLan2.de4.repository;

import com.example.LuyenTapLan2.de4.model.MonAn;
import com.example.LuyenTapLan2.de4.model.NhaHang;
import com.example.LuyenTapLan2.de4.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class MonAnRepo {
    private Session s = null;

    public MonAnRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<MonAn> getAll() {
        return s.createQuery("FROM MonAn ").list();
    }

    public MonAn getOne(Integer id) {
        return s.find(MonAn.class, id);
    }

    public void add(MonAn ma) {
        try {
            s.getTransaction().begin();
            s.save(ma);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(MonAn ma) {
        try {
            s.getTransaction().begin();
            s.merge(ma);
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

    public List<MonAn> searchByKhoangGia(int min, int max) {
        Query q = s.createQuery("FROM MonAn WHERE gia >= :min AND gia <= :max");
        q.setParameter("min", min);
        q.setParameter("max", max);
        return q.list();
    }

    public List<MonAn> pageBy3(int page, int pageSize) {
        Query q = s.createQuery("FROM MonAn ");
        q.setFirstResult(pageSize * page);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
