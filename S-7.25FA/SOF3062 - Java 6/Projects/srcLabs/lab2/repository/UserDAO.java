package org.example.springcustomauthwithdb.repository;

import org.example.springcustomauthwithdb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, String> {
}
