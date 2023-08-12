package com.example.myspringproject.controller.publicapi;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("public-api-login")
public class LoginController {
    private final IAccountService accountService;

    @GetMapping
    public void loginPage(){

    }
    @PostMapping
    public Account login(@RequestParam String username, @RequestParam String password){
        return null;
    }
}
