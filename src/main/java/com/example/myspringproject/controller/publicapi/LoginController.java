package com.example.myspringproject.controller.publicapi;

import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("public-api-login")
public class LoginController {

    private final AuthenticationManager authenticationManager;


    @PostMapping
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password){
        try {
            // Xác thực người dùng
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );

            // Đặt thông tin chứng thực vào SecurityContextHolder
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // Xác thực thành công
            return ResponseEntity.ok("Authentication successful!");
        } catch (AuthenticationException e) {
            // Xác thực không thành công
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }
}
