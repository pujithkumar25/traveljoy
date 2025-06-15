package com.traveljoy.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.traveljoy.model.User;
import com.traveljoy.repository.UserRepository;

@Service
public class UserService {
  @Autowired
  private UserRepository repo;

  public User register(User u) { return repo.save(u); }
  public User findByEmail(String email) { return repo.findByEmail(email); }
}
