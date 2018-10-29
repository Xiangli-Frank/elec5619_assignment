package com.example.demo.repository;

import com.example.demo.entity.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserDTO,String> {
}
