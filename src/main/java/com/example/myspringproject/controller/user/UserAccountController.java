package com.example.myspringproject.controller.user;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-user")
@RequiredArgsConstructor
public class UserAccountController {
    private IAccountService accountService;
    @GetMapping("{id}")
    public Account findById(@PathVariable(name = "id") Long id){
        return accountService.findById(id);
    }
}
