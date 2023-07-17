package com.bank.model;
import lombok.Data;

@Data
public class Account {
    private String accountNumber;
    private double balance;
    private String username;
    private String password;
}
