package com.example.sd21101sof3012.buoi9.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "truong_hoc")
public class TruongHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten_truong")
    private String tenTruong;

    @Column(name = "dia_chi")
    private String diaChi;
}
