package com.example.sd21101sof3012.buoi1.repository;

import com.example.sd21101sof3012.buoi1.entity.SinhVien;
import com.example.sd21101sof3012.buoi1.util.HibernateConfig;
import org.hibernate.Session;

import java.util.List;

public class SinhVienRepository {
    private Session session = null;

    public SinhVienRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }
    public List<SinhVien> getAll() {
        return session.createQuery("FROM SinhVien sv").list();
    }
}
