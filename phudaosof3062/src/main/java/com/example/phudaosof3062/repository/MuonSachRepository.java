package com.example.phudaosof3062.repository;

import com.example.phudaosof3062.model.MuonSach;
import com.example.phudaosof3062.response.MuonSachResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MuonSachRepository extends JpaRepository<MuonSach, Integer> {
    @Query(
            """
            SELECT new com.example.phudaosof3062.response.MuonSachResponse(
                ms.id,
                ms.nguoiMuon,
                ms.soNgayMuon,
                ms.daTra,
                ms.sach.tenSach,
                ms.sach.tacGia
            ) FROM MuonSach ms
            """
    )
    public List<MuonSachResponse> getAll();
}
