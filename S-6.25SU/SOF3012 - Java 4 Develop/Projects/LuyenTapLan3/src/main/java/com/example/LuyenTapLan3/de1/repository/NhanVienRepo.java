package com.example.LuyenTapLan3.de1.repository;

import com.example.LuyenTapLan3.HibernateConfig;
import com.example.LuyenTapLan3.de1.model.NhanVien;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class NhanVienRepo {
    private Session s = null;

    public NhanVienRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<NhanVien> getAll() {
        return s.createQuery("FROM NhanVien ").list();
    }

    public NhanVien getOne(Integer id) {
        return s.find(NhanVien.class, id);
    }

    public void add(NhanVien nv) {
        try {
            s.getTransaction().begin();
            s.save(nv);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(NhanVien nv) {
        try {
            s.getTransaction().begin();
            s.merge(nv);
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

    public List<NhanVien> searchByFullname(String ten, String tenDem, String ho) {
        Query q = s.createQuery("FROM NhanVien nv WHERE nv.ten LIKE :ten AND nv.tenDem LIKE :tenDem AND nv.ho LIKE :ho");
        q.setParameter("ten", ten);
        q.setParameter("tenDem", tenDem);
        q.setParameter("ho", ho);
        return q.list();
    }

    public List<NhanVien> sortByTen() {
        Query q = s.createQuery("FROM NhanVien nv ORDER BY nv.ten DESC");
        return q.list();
    }

    public List<NhanVien> pageBy5(int page, int pageSize) {
        Query q = s.createQuery("FROM NhanVien nv");
        q.setFirstResult(pageSize * page);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
