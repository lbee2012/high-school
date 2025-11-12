package com.example.d1023.repository;

import com.example.d1023.model.DatPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatPhongRepo extends JpaRepository<DatPhong, Integer> {
    public List<DatPhong> findDatPhongsByTenKhachHangContains(String tenKhachHang);
    public List<DatPhong> findDatPhongsBySoDemDatBetween(Integer min, Integer max);
}
