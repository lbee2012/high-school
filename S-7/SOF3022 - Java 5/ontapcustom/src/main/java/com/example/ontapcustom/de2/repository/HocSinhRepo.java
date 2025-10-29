package com.example.ontapcustom.de2.repository;

import com.example.ontapcustom.de2.model.HocSinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HocSinhRepo extends JpaRepository<HocSinh, Integer> {
    public List<HocSinh> findHocSinhsByTenContains(String ten);
}
