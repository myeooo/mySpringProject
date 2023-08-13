package com.example.myspringproject.controller.publicapi;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("public-api-login")
public class LoginController {

    @PostMapping
    public Account login(@RequestParam String username, @RequestParam String password){
        return null;
    }
}
