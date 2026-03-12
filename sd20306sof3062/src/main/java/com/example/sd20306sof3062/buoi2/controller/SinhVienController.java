package com.example.sd20306sof3062.buoi2.controller;

import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import com.example.sd20306sof3062.buoi2.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinh-vien")
public class SinhVienController {
    @Autowired
    SinhVienRepository sinhVienRepository;

    @GetMapping("/hien-thi")
    public List<SinhVien> getAll() {
        return sinhVienRepository.findAll();
    }

    @PostMapping("/them")
    public String themSinhVien(@RequestBody SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
        return "them thanh cong";
    }
}
