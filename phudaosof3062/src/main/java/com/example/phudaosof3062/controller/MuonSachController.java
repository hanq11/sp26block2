package com.example.phudaosof3062.controller;

import com.example.phudaosof3062.dto.MuonSachRequest;
import com.example.phudaosof3062.dto.MuonSachResponse;
import com.example.phudaosof3062.model.MuonSach;
import com.example.phudaosof3062.repository.MuonSachRepository;
import com.example.phudaosof3062.service.MuonSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/muon-sach")
public class MuonSachController {
    @Autowired
    MuonSachService muonSachService;

    @Autowired
    MuonSachRepository muonSachRepository;
    @GetMapping("/hien-thi")
    public List<MuonSachResponse> hienThi() {
        return muonSachService.getAll();
    }

    @PostMapping("/them")
    public void them(@RequestBody MuonSachRequest muonSachRequest) {
        muonSachService.them(muonSachRequest);
    }
    @PutMapping("/sua")
    public void sua(@RequestBody MuonSachRequest muonSachRequest) {
        muonSachService.sua(muonSachRequest);
    }

    @DeleteMapping("/xoa/{id}")
    public void xoa(@PathVariable("id") Integer id) {
        muonSachService.xoa(id);
    }

    @GetMapping("/phan-trang")
    public List<MuonSach> phanTrang(@RequestParam(name = "page", defaultValue = "0") Integer page) {
        int size = 3;
        Pageable pageable = PageRequest.of(page, size);
        return muonSachRepository.findAll(pageable).getContent();
    }
}
