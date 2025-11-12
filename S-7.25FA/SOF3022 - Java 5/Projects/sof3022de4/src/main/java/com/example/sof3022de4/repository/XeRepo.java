package com.example.sof3022de4.repository;

import com.example.sof3022de4.model.Xe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface XeRepo extends JpaRepository<Xe, Integer> {
    public List<Xe> findXesByTenXeContains(String tenXe);
}
