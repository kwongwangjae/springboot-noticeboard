package com.example.springbootnoticeboard.domain.user.domain.repository;

import com.example.springbootnoticeboard.domain.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
