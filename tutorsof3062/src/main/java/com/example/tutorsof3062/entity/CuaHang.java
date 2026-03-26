package com.example.tutorsof3062.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//-- Tạo bảng cua_hang
//        CREATE TABLE cua_hang (
//        id INT IDENTITY(1,1) PRIMARY KEY,
//        ten_cua_hang NVARCHAR(100)
//        );
//        GO
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cua_hang")
public class CuaHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_cua_hang")
    private String tenCuaHang;
}
