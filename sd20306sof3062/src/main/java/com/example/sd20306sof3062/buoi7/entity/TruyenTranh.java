package com.example.sd20306sof3062.buoi7.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//id INT IDENTITY(1,1) PRIMARY KEY,
//        ten_truyen NVARCHAR(100),
//        the_loai NVARCHAR(50),
//        gia INT,
//        con_hang BIT,                      -- 1: còn hàng, 0: hết hàng
//        cua_hang_id INT FOREIGN KEY REFERENCES cua_hang(id)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "truyen_tranh")
public class TruyenTranh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_truyen")
    private String tenTruyen;

    @Column(name = "the_loai")
    private String theLoai;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "con_hang")
    private Boolean conHang;

    @ManyToOne
    @JoinColumn(name = "cua_hang_id", referencedColumnName = "id")
    private CuaHang cuaHang;
}
