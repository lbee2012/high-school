package com.example.sof3022deevent.repository;

import com.example.sof3022deevent.model.Ve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeRepo extends JpaRepository<Ve, Integer> {
}
