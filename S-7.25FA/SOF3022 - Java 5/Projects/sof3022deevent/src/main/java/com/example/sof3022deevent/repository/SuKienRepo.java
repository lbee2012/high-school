package com.example.sof3022deevent.repository;

import com.example.sof3022deevent.model.SuKien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuKienRepo extends JpaRepository<SuKien, Integer> {
}
