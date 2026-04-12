package com.example.phudaosof3062.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//CREATE TABLE muon_sach (
//        id INT IDENTITY(1,1) PRIMARY KEY,
//        nguoi_muon NVARCHAR(100),
//        so_ngay_muon INT,
//        da_tra BIT, -- 1: đã trả, 0: chưa trả
//        id_sach INT FOREIGN KEY REFERENCES sach(id)
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "muon_sach")
public class MuonSach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nguoi_muon")
    private String nguoiMuon;

    @Column(name = "so_ngay_muon")
    private Integer soNgayMuon;

    @Column(name = "da_tra")
    private Boolean daTra;

    @ManyToOne
    @JoinColumn(name = "id_sach", referencedColumnName = "id")
    private Sach sach;
}
