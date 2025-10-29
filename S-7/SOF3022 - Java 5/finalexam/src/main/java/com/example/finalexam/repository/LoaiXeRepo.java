package com.example.finalexam.repository;

import com.example.finalexam.model.LoaiXe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiXeRepo extends JpaRepository<LoaiXe, Integer> {
}
