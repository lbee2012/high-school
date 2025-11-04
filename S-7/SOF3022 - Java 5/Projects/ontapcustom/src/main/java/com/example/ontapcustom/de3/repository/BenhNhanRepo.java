package com.example.ontapcustom.de3.repository;

import com.example.ontapcustom.de3.model.BenhNhan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BenhNhanRepo extends JpaRepository<BenhNhan, Integer> {
    public List<BenhNhan> findBenhNhansByTenContains(String ten);
}
