package com.example.phudaosof3062.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MuonSachResponse {
    private Integer id;

    private String nguoiMuon;

    private Integer soNgayMuon;

    private Boolean daTra;

    private String tenSach;

    private String tacGia;
}
