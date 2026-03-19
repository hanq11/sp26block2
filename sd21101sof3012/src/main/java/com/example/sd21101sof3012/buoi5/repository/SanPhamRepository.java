package com.example.sd21101sof3012.buoi5.repository;

import com.example.sd21101sof3012.buoi5.entity.SanPham;
import com.example.sd21101sof3012.buoi5.util.HibernateConfigBuoi5;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session session = null;

    public SanPhamRepository() {
        session = HibernateConfigBuoi5.getFACTORY().openSession();
    }

    public List<SanPham> getAll() {
        return session.createQuery("FROM SanPham sp").list();
    }

    public void themSanPham(SanPham sanPham) {
        try {
            session.getTransaction().begin();
            session.save(sanPham);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public SanPham getById(Integer id) {
        return session.find(SanPham.class, id);
    }

    public void xoaSanPham(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    public void suaSanPham(SanPham sanPham) {
        try {
            session.getTransaction().begin();
            session.merge(sanPham);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
}
