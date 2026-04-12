package com.example.phudaosof3062.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//CREATE TABLE sach (
//        id INT IDENTITY(1,1) PRIMARY KEY,
//        ten_sach NVARCHAR(150),
//        tac_gia NVARCHAR(100)
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sach")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_sach")
    private String tenSach;

    @Column(name = "tac_gia")
    private String tacGia;
}
