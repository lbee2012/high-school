package com.example.ontapcustom2.de1.repository;

import com.example.ontapcustom2.de1.model.PhieuMuon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuMuonRepo extends JpaRepository<PhieuMuon, Integer> {
}
