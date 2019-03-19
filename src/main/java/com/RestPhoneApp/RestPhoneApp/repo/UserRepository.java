package com.RestPhoneApp.RestPhoneApp.repo;

import com.RestPhoneApp.RestPhoneApp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}