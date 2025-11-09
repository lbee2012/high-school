package com.example.LuyenTapLan3.de3.repository;

import com.example.LuyenTapLan3.de3.model.LoaiSP;
import com.example.LuyenTapLan3.de3.model.SanPham;
import com.example.LuyenTapLan3.de3.util.HibernateConfig;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class SanPhamRepo {
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

    public List<SanPham> searchByTenSP(String tenSP) {
        Query q = s.createQuery("FROM SanPham sp WHERE sp.tenSP LIKE :tenSP");
        q.setParameter("tenSP", "%" + tenSP + "%");
        return q.list();
    }

    public List<SanPham> pageSP(int page, int pageSize) {
        Query q = s.createQuery("FROM SanPham sp ");
        q.setFirstResult(page * pageSize);
        q.setMaxResults(pageSize);
        return q.list();
    }
}
