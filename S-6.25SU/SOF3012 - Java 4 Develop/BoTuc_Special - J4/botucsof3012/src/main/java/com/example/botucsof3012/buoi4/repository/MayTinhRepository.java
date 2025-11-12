package com.example.botucsof3012.buoi4.repository;

import com.example.botucsof3012.buoi4.util.HibernateConfig;
import com.example.botucsof3012.buoi4.model.MayTinh;
import org.hibernate.Session;

import java.util.List;

public class MayTinhRepository {
    private Session session = null;

    public MayTinhRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<MayTinh> getAll() {
        return session.createQuery("FROM MayTinh ").list();
    }

    public MayTinh getOne(Integer id) {
        return session.find(MayTinh.class, id);
    }

    public void add(MayTinh mt) {
        try {
            session.getTransaction().begin();
            session.save(mt);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(MayTinh mt) {
        try {
            session.getTransaction().begin();
            session.merge(mt);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void delete(Integer id) {
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
