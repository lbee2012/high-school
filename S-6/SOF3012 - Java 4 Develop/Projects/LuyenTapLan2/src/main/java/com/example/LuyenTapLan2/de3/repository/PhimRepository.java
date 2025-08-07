package com.example.LuyenTapLan2.de3.repository;

import com.example.LuyenTapLan2.de3.model.Phim;
import com.example.LuyenTapLan2.de3.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class PhimRepository {
    private Session s = null;

    public PhimRepository() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<Phim> getAll() {
        return s.createQuery("FROM Phim ").list();
    }

    public Phim getOne(Integer id) {
        return s.find(Phim.class, id);
    }

    public void add(Phim p) {
        try {
            s.getTransaction().begin();
            s.save(p);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(Phim p) {
        try {
            s.getTransaction().begin();
            s.merge(p);
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

    public List<Phim> searchByTen(String tenPhim) {
        Query q = s.createQuery("FROM Phim p WHERE tenPhim LIKE :tenPhim");
        q.setParameter("tenPhim", "%" + tenPhim + "%");
        return q.list();
    }

    public List<Phim> sortByNamPhatHanh() {
        Query q = s.createQuery("FROM Phim p ORDER BY p.namPhatHanh DESC");
        return q.list();
    }

    public List<Phim> pageBy3(int page, int pageSize) {
        Query q = s.createQuery("FROM Phim ");
        q.setFirstResult(page * pageSize);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
