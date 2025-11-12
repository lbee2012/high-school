package com.example.buoi2.repository;

import com.example.buoi2.model.SinhVien;
import com.example.buoi2.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SinhVienRepository {
    private Session session = null;

    public SinhVienRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<SinhVien> getAll() {
        return session.createQuery("FROM SinhVien").list();
    }

    public SinhVien getOne(Integer id) {
        return session.find(SinhVien.class, id);
    }

    public void themSinhVien(SinhVien sinhVien) {
        try {
            session.getTransaction().begin();
            session.save(sinhVien);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void suaSinhVien(SinhVien sinhVien) {
        try {
            session.getTransaction().begin();
            session.merge(sinhVien);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void xoaSinhVien(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getOne(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public List<SinhVien> sapXepTheoNamSinh() {
        return session.createQuery("FROM SinhVien sv ORDER BY sv.namSinh DESC").list();
    }

    public List<SinhVien> searchByTen(String ten) {
        Query query = session.createQuery("FROM SinhVien sv WHERE ten LIKE :ten");
        query.setParameter("ten", "%" + ten + "%");
        return query.list();
    }

    public List<SinhVien> phanTrang(int page, int pageSize) {
        Query query = session.createQuery("FROM SinhVien");
        query.setFirstResult(page * pageSize);
        query.setMaxResults(pageSize);
        return query.list();
    }
}
