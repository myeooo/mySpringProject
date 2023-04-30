package com.example.myspringproject.service;

import com.example.myspringproject.entity.Account;

import java.util.List;


public interface IAccountService {
    Account findById(Long id);
    List<Account> findByName(String name);
    List<Account> findAll();
    Account insert(Account account);
}
