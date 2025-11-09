package com.example.LuyenTapLan2.de2.repository;

import com.example.LuyenTapLan2.de2.model.LopHoc;
import com.example.LuyenTapLan2.de2.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LopHocRepo {
    private Session s = null;

    public LopHocRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<LopHoc> getAll() {
        return s.createQuery("FROM LopHoc ").list();
    }

    public LopHoc getOne(Integer id) {
        return s.find(LopHoc.class, id);
    }

    public void add(LopHoc lh) {
        try {
            s.getTransaction().begin();
            s.save(lh);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(LopHoc lh) {
        try {
            s.getTransaction().begin();
            s.merge(lh);
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

    public List<LopHoc> searchByTen(String tenLop) {
        Query q = s.createQuery("FROM LopHoc lh WHERE tenLop LIKE :tenLop");
        q.setParameter("tenLop", "%" + tenLop + "%");
        return q.list();
    }

    public List<LopHoc> sortBySoLuongSV() {
        Query q = s.createQuery("FROM LopHoc lh ORDER BY lh.soLuongSV DESC");
        return q.list();
    }

    public List<LopHoc> pageBy5(int page, int pageSize) {
        Query q = s.createQuery("FROM LopHoc ");
        q.setFirstResult(pageSize);
        q.setMaxResults(pageSize * page);
        return q.list();
    }
}
