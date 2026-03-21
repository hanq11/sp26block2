package com.example.sd20306sof3062.buoi2.dto;

import com.example.sd20306sof3062.buoi2.entity.LopHoc;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVienRequest {
    private Integer id;

    private String ten;

    private Integer tuoi;

    private String ngaySinh;

    private Boolean gioiTinh;

    private LopHoc lopHoc;
}
