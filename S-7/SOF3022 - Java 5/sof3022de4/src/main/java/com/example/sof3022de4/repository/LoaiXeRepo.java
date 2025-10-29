package com.example.sof3022de4.repository;

import com.example.sof3022de4.model.LoaiXe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiXeRepo extends JpaRepository<LoaiXe, Integer> {
}
