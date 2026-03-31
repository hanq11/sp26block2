package com.example.tutorsof3062.repository;

import com.example.tutorsof3062.entity.TruyenTranh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruyenTranhRepository extends JpaRepository<TruyenTranh, Integer> {

    // JPA Query method
    public List<TruyenTranh> findTruyenTranhsByTenTruyenContains(String tenTruyen);

    // Native query - JPQL
    @Query(value = "SELECT tt FROM TruyenTranh tt WHERE tt.tenTruyen LIKE %:tenTruyen%")
    public List<TruyenTranh> timKiemTheoTenJPQL(@Param("tenTruyen") String tenTruyen);

    // Native query - SQL
    @Query(value = "SELECT * FROM truyen_tranh WHERE ten_truyen LIKE %:tenTruyen%", nativeQuery = true)
    public List<TruyenTranh> timKiemTheoTenSQL(@Param("tenTruyen") String tenTruyen);
}
