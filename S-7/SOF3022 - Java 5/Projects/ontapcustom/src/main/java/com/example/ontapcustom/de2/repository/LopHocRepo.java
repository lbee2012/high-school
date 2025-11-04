package com.example.ontapcustom.de2.repository;

import com.example.ontapcustom.de2.model.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LopHocRepo extends JpaRepository<LopHoc, Integer> {
}
