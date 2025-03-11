package com.example.banking.service.impl;

import com.example.banking.dto.AccountDto;
import com.example.banking.repository.AccountRepository;
import com.example.banking.service.AccountService;

public class AccountServiceImpl implements AccountService {

    // Injects the AccountRepository dependency, allowing AccountService to interact with the database.
    final private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    //method from the AccountService interface
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }
}
