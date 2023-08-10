package com.example.myspringproject.repository;

import com.example.myspringproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Long> {
    List<Account> findByName(String name);
    List<Account> findAll();
    @Query(value = "select * from account as a where a.username = username limit 1", nativeQuery = true)
    Account findByUsername(String username);
}
