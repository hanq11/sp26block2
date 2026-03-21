package com.example.sd20306sof3062.buoi2.dto;

import com.example.sd20306sof3062.buoi2.entity.LopHoc;
import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienResponse {
    private Integer id;

    private String ten;

    private Integer tuoi;

    private String ngaySinh;

    private Boolean gioiTinh;

    private LopHoc lopHoc;

    public SinhVienResponse(SinhVien sinhVien) {
        this.id = sinhVien.getId();
        this.ten = sinhVien.getTen();
        this.tuoi = sinhVien.getTuoi();
        this.ngaySinh = sinhVien.getNgaySinh();
        this.gioiTinh = sinhVien.getGioiTinh();
        this.lopHoc = sinhVien.getLopHoc();
    }
}
