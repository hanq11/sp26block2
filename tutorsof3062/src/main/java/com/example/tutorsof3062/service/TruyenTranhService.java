package com.example.tutorsof3062.service;

import com.example.tutorsof3062.entity.TruyenTranh;

import java.util.List;

public interface TruyenTranhService {
    public List<TruyenTranh> hienThi();

    public void them(TruyenTranh truyenTranh);

    public void sua(TruyenTranh truyenTranh);

    public void xoa(Integer id);
}
