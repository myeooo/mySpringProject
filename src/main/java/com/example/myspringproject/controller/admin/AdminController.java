package com.example.myspringproject.controller.admin;
import com.example.myspringproject.entity.Account;
import com.example.myspringproject.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-admin")
public class AdminController {
    private final IAccountService accountService;

    @GetMapping("users")
    public List<Account> listUsers() {
        return accountService.findAll();
    }
    @GetMapping("users/search")
    public List<Account> showUserByName(@RequestParam(name = "name") String name) {
        return accountService.findByName(name);
    }

    @GetMapping("user/{id}")
    public Account showUserById(@PathVariable(name = "id") Long id) {
        return accountService.findById(id);
    }

    @PostMapping("users")
    public Long insertAccount(@RequestBody Account account){
        return accountService.insert(account).getId();
    }
    @PutMapping("users")
    public Long modifyAccount(@RequestBody Account account){
        return accountService.modify(account).getId();
    }
    @DeleteMapping("users")
    public boolean softDelete(@PathVariable Long id){
        return accountService.softDelete(id);
    }
    @DeleteMapping("users/remove/{id}")
    public boolean deleteAccount(@PathVariable(name = "id") Long id){
        return accountService.delete(id);
    }
}
