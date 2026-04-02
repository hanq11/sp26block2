package com.example.tutorsof3062.service;

import com.example.tutorsof3062.entity.TruyenTranh;
import com.example.tutorsof3062.request.TruyenTranhRequest;
import com.example.tutorsof3062.response.TruyenTranhResponse;

import java.util.List;

public interface TruyenTranhService {
    public List<TruyenTranhResponse> hienThi();

    public void them(TruyenTranhRequest truyenTranhRequest);

    public void sua(TruyenTranhRequest truyenTranhRequest);

    public void xoa(Integer id);
}
