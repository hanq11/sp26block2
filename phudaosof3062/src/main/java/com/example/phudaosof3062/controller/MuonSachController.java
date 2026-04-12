package com.example.phudaosof3062.controller;

import com.example.phudaosof3062.model.MuonSach;
import com.example.phudaosof3062.repository.MuonSachRepository;
import com.example.phudaosof3062.response.MuonSachResponse;
import com.example.phudaosof3062.service.MuonSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/muon-sach")
public class MuonSachController {
    @Autowired
    MuonSachService muonSachService;

    @GetMapping("/hien-thi")
    public List<MuonSachResponse> hienThi() {
        return muonSachService.getAll();
    }
}
