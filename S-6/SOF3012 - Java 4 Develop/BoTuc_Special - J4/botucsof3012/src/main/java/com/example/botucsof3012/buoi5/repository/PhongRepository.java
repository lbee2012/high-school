package com.example.botucsof3012.buoi5.repository;

import com.example.botucsof3012.buoi5.model.Phong;
import com.example.botucsof3012.buoi5.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class PhongRepository {
    private Session session = null;

    public PhongRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<Phong> getAllPhong() {
        return session.createQuery("FROM Phong").list();
    }

    public Phong getOnePhong(Integer id) {
        return session.find(Phong.class, id);
    }

    public void addPhong(Phong phong) {
        try {
            session.getTransaction().begin();
            session.save(phong);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void updatePhong(Phong phong) {
        try {
            session.getTransaction().begin();
            session.merge(phong);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deletePhong(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getOnePhong(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
