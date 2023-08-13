package com.example.myspringproject.service;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.repository.AccountRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService{
    private final AccountRepo accountRepo;
    private final PasswordEncoder passwordEncoder;
    @Override
    public Account findById(Long id) {
        return accountRepo.findById(id).get();
    }
    public List<Account> findByName(String name) {
        return accountRepo.findByName(name);
    }

    @Override
    public Account findByUsername(String username) {
        return accountRepo.findByUsername(username);
    }

    @Override
    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    public Account insert(Account account){
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepo.save(account);
    }

    public Account modify(Account account){
        Account ret = accountRepo.findById(account.getId()).get();
        ret.setEmail(account.getEmail());
        ret.setName(account.getName());
        ret.setRoles(account.getRoles());
        ret.setPassword(passwordEncoder.encode(account.getPassword()));
        return accountRepo.save(ret);
    }

    @Override
    public boolean  softDelete(Long id) {
        Account ret = accountRepo.findById(id).get();
        if(ret!= null){
            ret.setIsActive(false);
            accountRepo.save(ret);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Long id) {
        Account ret = accountRepo.findById(id).get();
        if (ret != null) {
            accountRepo.delete(ret);
            return true;
        }
        return false;
    }
}
