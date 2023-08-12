package com.example.myspringproject.Authenticate;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class MyDatabaseUserDetailsService  implements UserDetailsService  {
    @Autowired
    IAccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account acc = accountService.findByUsername(username);
        return new MyUsers(acc);
    }
}
