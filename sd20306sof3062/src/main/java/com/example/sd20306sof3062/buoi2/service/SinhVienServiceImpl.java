package com.example.sd20306sof3062.buoi2.service;

import com.example.sd20306sof3062.buoi2.dto.SinhVienRequest;
import com.example.sd20306sof3062.buoi2.dto.SinhVienResponse;
import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import com.example.sd20306sof3062.buoi2.repository.SinhVienRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienServiceImpl implements SinhVienService{
    @Autowired
    SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVienResponse> getAll() {
        return sinhVienRepository
                .findAll()
                .stream()
                .map(SinhVienResponse::new)
                .toList();
    }

    @Override
    public void them(SinhVienRequest sinhVienRequest) {
        SinhVien sinhVien = new SinhVien();
        BeanUtils.copyProperties(sinhVienRequest, sinhVien);
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void sua(SinhVienRequest sinhVienRequest) {
        SinhVien sinhVien = new SinhVien();
        BeanUtils.copyProperties(sinhVienRequest, sinhVien);
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void xoa(Integer id) {
        sinhVienRepository.deleteById(id);
    }

    @Override
    public SinhVien getById(Integer id) {
        return sinhVienRepository.findById(id).get();
    }
}
