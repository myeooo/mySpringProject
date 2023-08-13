package com.example.myspringproject.controller.publicapi;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("public-api-register")
public class RegisterController {
    private final IAccountService accountService;

    @PostMapping
    public Account register(@RequestBody Account account){
        return accountService.insert(account);
    }

}
