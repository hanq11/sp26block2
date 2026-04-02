package com.example.sd20306sof3062.buoi2.controller;

import com.example.sd20306sof3062.buoi2.dto.SinhVienRequest;
import com.example.sd20306sof3062.buoi2.dto.SinhVienResponse;
import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import com.example.sd20306sof3062.buoi2.repository.SinhVienRepository;
import com.example.sd20306sof3062.buoi2.service.SinhVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinh-vien")
@CrossOrigin("http://localhost:5173")
public class SinhVienController {
    @Autowired
    SinhVienRepository sinhVienRepository;

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
    public List<SinhVienResponse> getAll() {
        return sinhVienService.getAll();
    }

    @GetMapping("/tim-kiem-theo-ten")
    public List<SinhVien> timKiemTheoTen(@RequestParam("ten") String ten) {
        return sinhVienRepository.findSinhViensByTenContains(ten);
    }

    @GetMapping("/test")
    public List<SinhVien> test(
            @RequestParam("batDau") String batDau,
            @RequestParam("ketThuc") String ketThuc
    ) {
        return sinhVienRepository.timKiemTheoKhoangNgaySinh(batDau, ketThuc);
    }
    @PostMapping("/them")
    public String themSinhVien(@RequestBody @Valid SinhVienRequest sinhVienRequest) {
        sinhVienService.them(sinhVienRequest);
        return "them thanh cong";
    }

    @PutMapping("/sua")
    public String suaSinhVien(@RequestBody SinhVienRequest sinhVienRequest) {
        sinhVienService.sua(sinhVienRequest);
        return "sua thanh cong";
    }

    @DeleteMapping("/xoa/{id}")
    public String xoaSinhVien(@PathVariable Integer id) {
        sinhVienService.xoa(id);
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

