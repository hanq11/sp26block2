package com.example.tutorsof3062.controller;

import com.example.tutorsof3062.entity.TruyenTranh;
import com.example.tutorsof3062.repository.TruyenTranhRepository;
import com.example.tutorsof3062.request.TruyenTranhRequest;
import com.example.tutorsof3062.response.TruyenTranhResponse;
import com.example.tutorsof3062.service.TruyenTranhService;
import com.example.tutorsof3062.service.impl.TruyenTranhServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truyen-tranh")
public class TruyenTranhController {
    @Autowired
    TruyenTranhRepository truyenTranhRepository;

    @Autowired
    TruyenTranhService truyenTranhService;
    @GetMapping("/hien-thi")
    public List<TruyenTranhResponse> hienThi() {
        return truyenTranhService.hienThi();
    }

    @PostMapping("/them")
    public String them(@RequestBody @Valid TruyenTranhRequest truyenTranhRequest) {
        truyenTranhService.them(truyenTranhRequest);
        return "them thanh cong";
    }

    @PutMapping("/sua")
    public String sua(@RequestBody @Valid TruyenTranhRequest truyenTranhRequest) {
        truyenTranhService.sua(truyenTranhRequest);
        return "sua thanh cong";
    }

    @DeleteMapping("/xoa/{id}")
    public String xoa(@PathVariable("id") Integer id) {
        truyenTranhService.xoa(id);
        return "xoa thanh cong";
    }

    @GetMapping("/phan-trang")
    public List<TruyenTranh> phanTrang(@RequestParam(name = "pageNumber", defaultValue = "0") Integer pageNumber,
                                       @RequestParam(name = "pageSize", defaultValue = "3") Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return truyenTranhRepository.findAll(pageable).getContent();
    }

    @GetMapping("/tim-kiem-theo-ten")
    public List<TruyenTranh> timKiemTheoTen(@RequestParam("tenTruyen") String tenTruyen) {
        System.out.println("JPQL:");
        truyenTranhRepository
                .timKiemTheoTenJPQL(tenTruyen)
                .forEach(tt ->
                        System.out.println(tt.getTenTruyen())
                );
        System.out.println("SQL:");
        truyenTranhRepository
                .timKiemTheoTenSQL(tenTruyen)
                .forEach(tt ->
                        System.out.println(tt.getTenTruyen())
                );
        return truyenTranhRepository.findTruyenTranhsByTenTruyenContains(tenTruyen);
    }
}
