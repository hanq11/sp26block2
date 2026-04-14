package com.example.phudaosof3062.dto;

import com.example.phudaosof3062.model.Sach;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MuonSachRequest {
    private Integer id;

    private String nguoiMuon;

    private Integer soNgayMuon;

    private Boolean daTra;

    private Sach sach;
}
