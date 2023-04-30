package com.example.myspringproject.repository;

import com.example.myspringproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Long> {
    List<Account> findByName(String name);
    List<Account> findAll();
}
