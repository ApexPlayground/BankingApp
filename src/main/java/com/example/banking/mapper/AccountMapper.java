package com.example.banking.mapper;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

public class AccountMapper {

    // this takes a DTO and convert it in to a JPA entity(account)
    public static Account mapToAccount(AccountDto accountDto){
        return new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
    }

    // this takes the entity(JPA) and convert it in to a DTO(data transfer object)
    public static AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getAccountHolder(),
                account.getBalance()
        );
    }
}
