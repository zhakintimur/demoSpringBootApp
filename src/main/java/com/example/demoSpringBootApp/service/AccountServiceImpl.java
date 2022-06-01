package com.example.demoSpringBootApp.service;

import com.example.demoSpringBootApp.entity.Account;
import com.example.demoSpringBootApp.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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
        Account account = accountRepository.findById(id).orElseThrow();
        account.setBalance(account.getBalance().add(sum));
        accountRepository.save(account);
    }

    @Override
    public void withdraw(Long id, BigDecimal sum) {
        Account account = accountRepository.findById(id).orElseThrow();
        if(account.getBalance().compareTo(sum) >= 0)
            account.setBalance(account.getBalance().subtract(sum));
        accountRepository.save(account);
    }

    @Override
    public void delete(Account account) {
        accountRepository.delete(account);
    }

    @Override
    public void deleteById(Long id) {
        accountRepository.deleteById(id);
    }


    @Override
    public List<Account> getAllAccounts() {
        return (List<Account>) accountRepository.findAll();
    }
}
