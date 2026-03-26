package com.example.tutorsof3062.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//id INT IDENTITY(1,1) PRIMARY KEY,
//        ten_truyen NVARCHAR(100),
//        ngay_phat_hanh DATE,
//        gia INT,
//        con_hang BIT,                      -- 1: còn hàng, 0: hết hàng
//        cua_hang_id INT FOREIGN KEY REFERENCES cua_hang(id)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "truyen_tranh")
public class TruyenTranh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_truyen")
    private String ten_truyen;

    @Column(name = "ngay_phat_hanh")
    private String ngayPhatHanh;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "con_hang")
    private Boolean conHang;

    @ManyToOne
    @JoinColumn(name = "cua_hang_id", referencedColumnName = "id")
    private CuaHang cuaHang;
}

