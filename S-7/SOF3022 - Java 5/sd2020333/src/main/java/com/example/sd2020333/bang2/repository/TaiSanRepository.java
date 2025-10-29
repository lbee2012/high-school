package com.example.sd2020333.bang2.repository;

import com.example.sd2020333.bang2.model.TaiSan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaiSanRepository extends JpaRepository<TaiSan, Integer> {
}
