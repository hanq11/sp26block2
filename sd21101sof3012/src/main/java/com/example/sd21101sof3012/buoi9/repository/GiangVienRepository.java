package com.example.sd21101sof3012.buoi9.repository;

import com.example.sd21101sof3012.buoi9.entity.GiangVien;
import com.example.sd21101sof3012.buoi9.util.HibernateConfigBuoi9;
import org.hibernate.Session;

import java.util.List;

public class GiangVienRepository {
    private Session session = null;

    public GiangVienRepository() {
        session = HibernateConfigBuoi9.getFACTORY().openSession();
    }

    public List<GiangVien> getAll() {
        return session.createQuery("FROM GiangVien gv").list();
    }

    public void them(GiangVien giangVien) {
        try {
            session.getTransaction().begin();
            session.save(giangVien);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public void sua(GiangVien giangVien) {
        try {
            session.getTransaction().begin();
            session.merge(giangVien);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public GiangVien getById(Integer id) {
        return session.find(GiangVien.class, id);
    }
    public void xoa(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

}
