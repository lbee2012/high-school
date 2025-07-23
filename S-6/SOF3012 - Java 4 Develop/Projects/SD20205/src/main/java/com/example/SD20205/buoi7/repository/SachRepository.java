package com.example.SD20205.buoi7.repository;

import com.example.SD20205.buoi7.model.Sach;
import com.example.SD20205.buoi7.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SachRepository {
    public Session session = null;

    public SachRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<Sach> getAll() {
        return session.createQuery("FROM Sach").list();
    }

    public Sach getOne(Integer id) {
        return session.find(Sach.class, id);
    }

    public void add(Sach s) {
        try {
            session.getTransaction().begin();
            session.save(s);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(Sach s) {
        try {
            session.getTransaction().begin();
            session.merge(s);
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
