package org.example.springcustomauthwithdb.repository;

import org.example.springcustomauthwithdb.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, String> {
}
