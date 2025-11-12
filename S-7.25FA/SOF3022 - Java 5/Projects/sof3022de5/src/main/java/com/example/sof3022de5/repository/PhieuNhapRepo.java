package com.example.sof3022de5.repository;

import com.example.sof3022de5.model.PhieuNhap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuNhapRepo extends JpaRepository<PhieuNhap, Integer> {
}
