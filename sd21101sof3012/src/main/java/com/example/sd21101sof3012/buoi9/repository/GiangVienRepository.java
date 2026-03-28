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
}
