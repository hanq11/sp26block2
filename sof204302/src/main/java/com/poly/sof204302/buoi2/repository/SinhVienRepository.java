/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sof204302.buoi2.repository;

import com.poly.sof204302.buoi2.model.SinhVien;
import com.poly.sof204302.buoi2.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class SinhVienRepository {
    private String getAllSQL = "SELECT id, ten, tuoi, gioi_tinh as gioiTinh FROM sinh_vien";
    
    public List<SinhVien> getAll() {
        return XQuery.getBeanList(SinhVien.class, getAllSQL);
    }
}
