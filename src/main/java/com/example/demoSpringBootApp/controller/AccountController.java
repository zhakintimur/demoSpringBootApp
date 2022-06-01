package com.example.demoSpringBootApp.controller;

import com.example.demoSpringBootApp.entity.Account;
import com.example.demoSpringBootApp.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/accounts")
@AllArgsConstructor
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }

    @PostMapping
    public void createNewAccount() {
        accountService.newAccount();
    }

    @GetMapping("{accountId}")
    public Account getAccountById(@PathVariable("accountId") Long accountId) {
        return accountService.getById(accountId);
    }

    @PostMapping("{accountId}/deposit")
    public void deposit(@PathVariable("accountId") Long accountId,
                        @RequestBody Integer amount) {
        accountService.deposit(accountId, new BigDecimal(amount));
    }

    @PostMapping("{accountId}/withdraw")
    public void withdraw(@PathVariable("accountId") Long accountId,
                        @RequestBody Integer amount) {
        accountService.withdraw(accountId, new BigDecimal(amount));
    }

    @DeleteMapping("{accountId}")
    public void deleteAccount(@PathVariable("accountId") Long accountId) {
        accountService.deleteById(accountId);
    }
}
