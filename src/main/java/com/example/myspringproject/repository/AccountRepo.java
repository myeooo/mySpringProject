package com.example.myspringproject.repository;

import com.example.myspringproject.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Long> {
    List<Account> findByName(String name);
    List<Account> findAll();
    @Query(value = "SELECT * FROM account AS a WHERE a.username = :username LIMIT 1", nativeQuery = true)
    Account findByUsername(@Param("username") String username);
}
