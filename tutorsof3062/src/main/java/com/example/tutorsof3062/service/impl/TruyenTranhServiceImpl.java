package com.example.tutorsof3062.service.impl;

import com.example.tutorsof3062.entity.TruyenTranh;
import com.example.tutorsof3062.exception.ApiException;
import com.example.tutorsof3062.repository.TruyenTranhRepository;
import com.example.tutorsof3062.request.TruyenTranhRequest;
import com.example.tutorsof3062.response.TruyenTranhResponse;
import com.example.tutorsof3062.service.TruyenTranhService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruyenTranhServiceImpl implements TruyenTranhService {
    @Autowired
    TruyenTranhRepository truyenTranhRepository;
    @Override
    public List<TruyenTranhResponse> hienThi() {
        return truyenTranhRepository
                .findAll()
                .stream()
                .map(TruyenTranhResponse::new)
                .toList();
    }

    @Override
    public void them(TruyenTranhRequest truyenTranhRequest) {
        TruyenTranh truyenTranh = new TruyenTranh();
        BeanUtils.copyProperties(truyenTranhRequest, truyenTranh);
        truyenTranhRepository.save(truyenTranh);
    }

    @Override
    public void sua(TruyenTranhRequest truyenTranhRequest) {
        TruyenTranh truyenTranh = new TruyenTranh();
        BeanUtils.copyProperties(truyenTranhRequest, truyenTranh);
        truyenTranhRepository.save(truyenTranh);
    }

    @Override
    public void xoa(Integer id) {
        truyenTranhRepository.findById(id).orElseThrow(
                () -> new ApiException("Id khong ton tai", "ID_NOT_FOUND")
        );
        truyenTranhRepository.deleteById(id);
    }
}
