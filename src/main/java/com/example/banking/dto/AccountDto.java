package com.example.banking.dto;

import lombok.*;

// using lombok to automatically create constructors, getters and setters
@Data
@AllArgsConstructor
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;}