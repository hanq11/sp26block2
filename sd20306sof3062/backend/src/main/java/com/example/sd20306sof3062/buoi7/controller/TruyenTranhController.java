package com.example.sd20306sof3062.buoi7.controller;

import com.example.sd20306sof3062.buoi7.entity.TruyenTranh;
import com.example.sd20306sof3062.buoi7.repository.TruyenTranhRepository;
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
    public List<TruyenTranh> getAll() {
        return truyenTranhRepository.findAll();
    }

    @PostMapping("/them")
    public void themTruyenTranh(@RequestBody TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
    }

    @PutMapping("/sua")
    public void suaTruyenTranh(@RequestBody TruyenTranh truyenTranh) {
        truyenTranhRepository.save(truyenTranh);
    }

    @DeleteMapping("/xoa/{id}")
    public void xoaTruyenTranh(@PathVariable("id") Integer id) {
        truyenTranhRepository.deleteById(id);
    }
}
