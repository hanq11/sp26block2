package com.example.tutorsof3062.request;

import com.example.tutorsof3062.entity.CuaHang;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TruyenTranhRequest {
    private Integer id;

    @NotBlank(message = "ten truyen khong duoc de trong")
    private String tenTruyen;

    @NotBlank(message = "ngay phat hanh khong duoc de trong")
    private String ngayPhatHanh;

    @NotNull(message = "gia khong duoc de trong")
    private Integer gia;

    @NotNull(message = "con hang khong duoc de trong")
    private Boolean conHang;

    @NotNull(message = "cua hang khong duoc de trong")
    private CuaHang cuaHang;
}
