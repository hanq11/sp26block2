package com.example.sd20306sof3062.buoi7.repository;

import com.example.sd20306sof3062.buoi7.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, Integer> {
}
