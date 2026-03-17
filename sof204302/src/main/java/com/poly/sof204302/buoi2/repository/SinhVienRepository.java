/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sof204302.buoi2.repository;

import com.poly.sof204302.buoi2.model.SinhVien;
import com.poly.sof204302.buoi2.util.XJdbc;
import com.poly.sof204302.buoi2.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class SinhVienRepository {
    private String getAllSQL = "SELECT id, ten, tuoi, gioi_tinh as gioiTinh FROM sinh_vien";
    
    private String insertSQL = "INSERT INTO sinh_vien SET ten = ?, tuoi = ?, gioi_tinh = ?";
    
    private String updateSQL = "UPDATE sinh_vien SET ten = ?, tuoi = ?, gioi_tinh = ? WHERE id = ?";
    
    private String deleteSQL = "DELETE FROM sinh_vien WHERE id = ?";
    
    public void delete(Integer id) {
        XJdbc.executeUpdate(deleteSQL, id);
    }
    
    public List<SinhVien> getAll() {
        return XQuery.getBeanList(SinhVien.class, getAllSQL);
    }
    
    public void insert(SinhVien sinhVien) {
        Object[] param = {
            sinhVien.getTen(),
            sinhVien.getTuoi(),
            sinhVien.getGioiTinh()
        };
        XJdbc.executeUpdate(insertSQL, param);
    }
    
    public void update(SinhVien sinhVien) {
        Object[] param = {
            sinhVien.getTen(),
            sinhVien.getTuoi(),
            sinhVien.getGioiTinh(),
            sinhVien.getId()
        };
        XJdbc.executeUpdate(updateSQL, param);
    }
}
