package com.example.myspringproject.service;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.repository.AccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService{
    private final AccountRepo accountRepo;

    @Override
    public Account findById(Long id) {
        return accountRepo.findById(id).get();
    }
    public List<Account> findByName(String name) {
        return accountRepo.findByName(name);
    }

    @Override
    public List<Account> findAll() {
        return accountRepo.findAll();
    }
}
