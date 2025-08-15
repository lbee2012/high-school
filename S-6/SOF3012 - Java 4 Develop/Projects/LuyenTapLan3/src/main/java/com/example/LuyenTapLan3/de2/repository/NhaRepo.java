package com.example.LuyenTapLan3.de2.repository;

import com.example.LuyenTapLan3.de2.model.ChuNha;
import com.example.LuyenTapLan3.de2.model.Nha;
import com.example.LuyenTapLan3.de2.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class NhaRepo {
    private Session s = null;

    public NhaRepo() {
        s = HibernateConfig.getFACTORY().openSession();
    }

    public List<Nha> getAll() {
        return s.createQuery("FROM Nha ").list();
    }

    public Nha getOne(Integer id) {
        return s.find(Nha.class, id);
    }

    public void add(Nha n) {
        try {
            s.getTransaction().begin();
            s.save(n);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(Nha n) {
        try {
            s.getTransaction().begin();
            s.merge(n);
            s.getTransaction().commit();
        } catch (Exception e) {
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public List<Nha> searchByDiaChi(String diaChi) {
        Query q = s.createQuery("FROM Nha n WHERE n.diaChi LIKE :diaChi");
        q.setParameter("diaChi", "%" + diaChi + "%");
        return q.list();
    }

    public List<Nha> sortByGiaTien() {
        Query q = s.createQuery("FROM Nha n ORDER BY n.giaTien DESC");
        return q.list();
    }

    public List<Nha> pageBy5 (int page, int pageSize) {
        Query q = s.createQuery("FROM Nha ");
        q.setFirstResult(pageSize * page);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
