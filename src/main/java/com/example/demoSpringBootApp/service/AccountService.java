package com.example.demoSpringBootApp.service;


import com.example.demoSpringBootApp.entity.Account;

import java.math.BigDecimal;

public interface AccountService {
    Account getById(Long id);
    void newAccount();
    void deposit(Long id, BigDecimal sum);
    void withdraw(Long id, BigDecimal sum);
    void delete(Account account);
}
