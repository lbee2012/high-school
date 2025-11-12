package org.example.springcustomauthwithdb.repository;

import org.example.springcustomauthwithdb.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleDAO extends JpaRepository<UserRole, Long> {
}
