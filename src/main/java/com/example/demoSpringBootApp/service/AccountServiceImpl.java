package com.example.demoSpringBootApp.service;

import com.example.demoSpringBootApp.entity.Account;
import com.example.demoSpringBootApp.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(
            AccountRepository accountRepository
    ) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account getById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public void newAccount() {
        accountRepository.save(new Account());
    }

    @Override
    public void deposit(Long id, BigDecimal sum) {

    }

    @Override
    public void withdraw(Long id, BigDecimal sum) {

    }

    @Override
    public void delete(Account account) {
        accountRepository.delete(account);
    }
}
