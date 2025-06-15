package com.traveljoy.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.traveljoy.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}
