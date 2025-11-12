package com.example.sd2020333.recheck1.repository;

import com.example.sd2020333.recheck1.model.GauBong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GauBongRepo extends JpaRepository<GauBong, Integer> {
}
