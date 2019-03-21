package com.blogspot.javabyrajasekhar.springboot2webappjsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogspot.javabyrajasekhar.springboot2webappjsp.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
