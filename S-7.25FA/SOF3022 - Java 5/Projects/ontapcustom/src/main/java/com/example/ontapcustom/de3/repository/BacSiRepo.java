package com.example.ontapcustom.de3.repository;

import com.example.ontapcustom.de3.model.BacSi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacSiRepo extends JpaRepository<BacSi, Integer> {
}
