package com.example.phudaosof3062.service;

import com.example.phudaosof3062.model.MuonSach;
import com.example.phudaosof3062.repository.MuonSachRepository;
import com.example.phudaosof3062.response.MuonSachResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuonSachService {
    @Autowired
    MuonSachRepository muonSachRepository;

    public List<MuonSachResponse> getAll() {
        return muonSachRepository.getAll();
    }

    public void them(MuonSach muonSach) {
        muonSachRepository.save(muonSach);
    }

    public void sua(MuonSach muonSach) {
        muonSachRepository.save(muonSach);
    }

    public void xoa(Integer id) {
        muonSachRepository.deleteById(id);
    }
}
