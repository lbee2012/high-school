package com.example.sof3022de5.repository;

import com.example.sof3022de5.model.ChiTiet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChiTietRepo extends JpaRepository<ChiTiet, Integer> {
    public List<ChiTiet> findChiTietsByTenSanPhamContains(String ten);
    public List<ChiTiet> findChiTietsByGiaNhapBetween(Double min, Double max);
}
