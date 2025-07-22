package com.example.botucsof3012.buoi5.repository;

import com.example.botucsof3012.buoi5.model.KhachSan;
import com.example.botucsof3012.buoi5.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class KhachSanRepository {
    private Session session = null;
    
    public KhachSanRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    // load combobox
    public List<KhachSan> getAllKhachSan() {
        return session.createQuery("FROM Phong").list();
    }

    // add, update Phong
    public KhachSan getOneKhachSan(Integer id) {
        return session.find(KhachSan.class, id);
    }
}
