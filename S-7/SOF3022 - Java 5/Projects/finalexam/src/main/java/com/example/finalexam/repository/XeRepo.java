package com.example.finalexam.repository;

import com.example.finalexam.model.Xe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XeRepo extends JpaRepository<Xe, Integer> {
}
