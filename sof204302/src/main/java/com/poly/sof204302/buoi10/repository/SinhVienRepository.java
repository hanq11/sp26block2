/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.sof204302.buoi10.repository;

import com.poly.sof204302.buoi10.model.SinhVien;
import com.poly.sof204302.buoi10.model.SinhVienResponse;
import com.poly.sof204302.buoi10.util.XQuery;
import java.util.List;

/**
 *
 * @author lovep
 */
public class SinhVienRepository {
    private String getAll = """
                            SELECT sv.id, sv.ten, sv.namSinh, nh.ten as 'tenNganhHoc'
                            FROM SinhVien sv
                            JOIN NganhHoc nh ON sv.idNganhHoc = nh.id
                            """;
    
    private String them = """
                          INSERT INTO [dbo].[SinhVien]
                                     ([ten]
                                     ,[namSinh]
                                     ,[idNganhHoc])
                               VALUES
                                     (?, ?, ?)
                          """;
    
    private String sua = """
                         UPDATE [dbo].[SinhVien]
                            SET [ten] = ?
                               ,[namSinh] = ?
                               ,[idNganhHoc] = ?
                          WHERE id = ?
                         """;
    
    private String xoa = """
                         DELETE FROM [dbo].[SinhVien]
                               WHERE id = ?
                         """;
    
    public List<SinhVienResponse> getAll() {
        return XQuery.getBeanList(SinhVienResponse.class, getAll);
    }
}
