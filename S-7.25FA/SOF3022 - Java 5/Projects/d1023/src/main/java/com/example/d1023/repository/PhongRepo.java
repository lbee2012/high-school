package com.example.d1023.repository;

import com.example.d1023.model.Phong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongRepo extends JpaRepository<Phong, Integer> {
}
