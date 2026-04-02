package com.example.sd20306sof3062.buoi2.dto;

import com.example.sd20306sof3062.buoi2.entity.LopHoc;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "ten khong duoc de trong")
    private String ten;

    @NotNull(message = "tuoi khong duoc de trong")
    private Integer tuoi;

    @NotBlank(message = "ngay sinh khong duoc de trong")
    private String ngaySinh;

    @NotNull(message = "gioi tinh khong duoc de trong")
    private Boolean gioiTinh;

    @NotNull(message = "lop hoc khong duoc de trong")
    private LopHoc lopHoc;
}
