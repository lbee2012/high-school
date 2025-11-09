package com.example.botucsof3012.buoi2.repository;

import com.example.botucsof3012.buoi2.model.NuocHoa;
import com.example.botucsof3012.buoi2.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class NuocHoaRepository {
    private Session session = null;

    public NuocHoaRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<NuocHoa> getAll() {
        return session.createQuery("FROM NuocHoa").list();
    }

    public NuocHoa getOne(Integer id) {
        return session.find(NuocHoa.class, id);
    }

    public void them(NuocHoa nh) {
        try {
            session.getTransaction().begin();
            session.save(nh);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void sua(NuocHoa nh) {
        try {
            session.getTransaction().begin();
            session.merge(nh);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void xoa(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getOne(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
