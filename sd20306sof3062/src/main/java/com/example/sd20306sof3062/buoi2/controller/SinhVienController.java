package com.example.sd20306sof3062.buoi2.controller;

import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import com.example.sd20306sof3062.buoi2.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/tim-kiem-theo-ten")
    public List<SinhVien> timKiemTheoTen(@RequestParam("ten") String ten) {
        return sinhVienRepository.findSinhViensByTenContains(ten);
    }


    @PostMapping("/them")
    public String themSinhVien(@RequestBody SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
        return "them thanh cong";
    }

    @PutMapping("/sua")
    public String suaSinhVien(@RequestBody SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
        return "sua thanh cong";
    }

    @DeleteMapping("/xoa/{id}")
    public String xoaSinhVien(@PathVariable Integer id) {
        sinhVienRepository.deleteById(id);
        return "xoa thanh cong";
    }

    @GetMapping("/phan-trang")
    public List<SinhVien> phanTrang(
            @RequestParam(name = "pageNumber", defaultValue = "0", required = false) Integer pageNumber) {
        int pageSize = 3;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return sinhVienRepository.findAll(pageable).getContent();
    }
}

