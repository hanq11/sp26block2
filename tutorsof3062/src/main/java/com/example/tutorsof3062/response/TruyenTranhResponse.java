package com.example.tutorsof3062.response;

import com.example.tutorsof3062.entity.CuaHang;
import com.example.tutorsof3062.entity.TruyenTranh;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TruyenTranhResponse {
    private Integer id;

    private String tenTruyen;

    private String ngayPhatHanh;

    private Integer gia;

    private Boolean conHang;

    private CuaHang cuaHang;

    public TruyenTranhResponse(TruyenTranh truyenTranh) {
        this.id = truyenTranh.getId();
        this.tenTruyen = truyenTranh.getTenTruyen();
        this.ngayPhatHanh = truyenTranh.getNgayPhatHanh();
        this.gia = truyenTranh.getGia();
        this.conHang = truyenTranh.getConHang();
        this.cuaHang = truyenTranh.getCuaHang();
    }
}
