package com.example.lan2.repository;

import com.example.lan2.model.TruongHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruongHocRepo extends JpaRepository<TruongHoc, Integer> {
}
