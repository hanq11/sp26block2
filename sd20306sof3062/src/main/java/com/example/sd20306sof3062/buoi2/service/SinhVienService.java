package com.example.sd20306sof3062.buoi2.service;

import com.example.sd20306sof3062.buoi2.dto.SinhVienRequest;
import com.example.sd20306sof3062.buoi2.dto.SinhVienResponse;
import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import com.example.sd20306sof3062.buoi2.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SinhVienService {
    public List<SinhVienResponse> getAll();
    public void them(SinhVienRequest sinhVienRequest);
    public void sua(SinhVienRequest sinhVienRequest);
    public void xoa(Integer id);
    public SinhVien getById(Integer id);
}
