package com.example.d1021.repository;

import com.example.d1021.model.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonHangRepo extends JpaRepository<DonHang, Integer> {
    public List<DonHang> findDonHangsByTenKhachHangContains(String ten);
}
