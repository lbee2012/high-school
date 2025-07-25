package com.example.LuyenTapLan1.task3.repository;

import com.example.LuyenTapLan1.task3.model.NhanVien;
import com.example.LuyenTapLan1.task3.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class NhanVienRepository {
    private Session s = null;

    public NhanVienRepository() {
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
}
