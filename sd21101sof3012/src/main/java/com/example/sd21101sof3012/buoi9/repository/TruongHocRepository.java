package com.example.sd21101sof3012.buoi9.repository;

import com.example.sd21101sof3012.buoi9.entity.TruongHoc;
import com.example.sd21101sof3012.buoi9.util.HibernateConfigBuoi9;
import org.hibernate.Session;

import java.util.List;

public class TruongHocRepository {
    private Session session = null;

    public TruongHocRepository() {
        session = HibernateConfigBuoi9.getFACTORY().openSession();
    }

    public List<TruongHoc> getAll() {
        return session.createQuery("FROM TruongHoc th").list();
    }

    public TruongHoc getById(Integer id) {
        return session.find(TruongHoc.class, id);
    }
}
