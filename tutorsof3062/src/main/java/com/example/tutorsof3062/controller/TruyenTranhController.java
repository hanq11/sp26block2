package com.example.tutorsof3062.controller;

import com.example.tutorsof3062.entity.TruyenTranh;
import com.example.tutorsof3062.repository.TruyenTranhRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/truyen-tranh")
public class TruyenTranhController {
    @Autowired
    TruyenTranhRepository truyenTranhRepository;

    @GetMapping("/hien-thi")
    public List<TruyenTranh> hienThi() {
        return truyenTranhRepository.findAll();
    }

    @PostMapping("/them")
    public String them(@RequestBody TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
        return "them thanh cong";
    }

    @PutMapping("/sua")
    public String sua(@RequestBody TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
        return "sua thanh cong";
    }

    @DeleteMapping("/xoa/{id}")
    public String xoa(@PathVariable("id") Integer id) {
        truyenTranhRepository.deleteById(id);
        return "xoa thanh cong";
    }
}
