package com.bank.service;

import com.bank.model.Account;

public class BankService {
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful, New balance: " + account.getBalance());
    }

    public void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdraw Successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds. Current balance: " + account.getBalance());
        }
    }
}
