package com.example.tutorsof3062.repository;

import com.example.tutorsof3062.entity.TruyenTranh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruyenTranhRepository extends JpaRepository<TruyenTranh, Integer> {
}
