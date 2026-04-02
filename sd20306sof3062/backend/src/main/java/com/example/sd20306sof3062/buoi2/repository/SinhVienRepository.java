package com.example.sd20306sof3062.buoi2.repository;

import com.example.sd20306sof3062.buoi2.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface SinhVienRepository extends JpaRepository<SinhVien, Integer> {
    // Query method
    public List<SinhVien> findSinhViensByTenContains(String ten);

    // JPQL - jarkata persistence query language
    @Query("SELECT sv FROM SinhVien sv WHERE sv.ngaySinh BETWEEN :batDau AND :ketThuc")
    public List<SinhVien> timKiemTheoKhoangNgaySinh(@Param("batDau") String batDau, @Param("ketThuc") String ketThuc);

    // SQL
    @Query(
            value = "SELECT * FROM sinh_vien WHERE ngaySinh BETWEEN :batDau AND :ketThuc",
            nativeQuery = true
    )
    public List<SinhVien> timKiemTheoKhoangNgaySinhSQL(@Param("batDau") String batDau, @Param("ketThuc") String ketThuc);
}
