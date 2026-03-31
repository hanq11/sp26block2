package com.example.tutorsof3062.service.impl;

import com.example.tutorsof3062.entity.TruyenTranh;
import com.example.tutorsof3062.repository.TruyenTranhRepository;
import com.example.tutorsof3062.service.TruyenTranhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruyenTranhServiceImpl implements TruyenTranhService {
    @Autowired
    TruyenTranhRepository truyenTranhRepository;
    @Override
    public List<TruyenTranh> hienThi() {
        return truyenTranhRepository.findAll();
    }

    @Override
    public void them(TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
    }

    @Override
    public void sua(TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
    }

    @Override
    public void xoa(Integer id) {
        truyenTranhRepository.deleteById(id);
    }
}
