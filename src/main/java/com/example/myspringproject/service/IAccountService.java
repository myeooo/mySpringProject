package com.example.myspringproject.service;

import com.example.myspringproject.entity.Account;

import java.util.List;


public interface IAccountService {
    Account findById(Long id);
    List<Account> findByName(String name);
    Account findByUsername(String username);
    List<Account> findAll();
    Account insert(Account account);
    Account modify(Account account);
    boolean softDelete(Long id);
    boolean delete(Long id);
}
