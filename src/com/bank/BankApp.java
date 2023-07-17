package com.bank;

import com.bank.model.Account;
import com.bank.service.BankService;
import com.bank.util.InputReader;

import java.sql.SQLOutput;

public class BankApp {
    public static void main(String[] args) {
        //set account
        Account account = new Account();
        account.setAccountNumber("1133594");
        account.setBalance(1000);
        account.setUsername("john");
        account.setPassword("12345");

        BankService bankService = new BankService();

        //login
        System.out.println("Please enter your username:");
        String username= InputReader.readString();
        System.out.println("Please enter your password");
        String password = InputReader.readString();

        if (username.equals(account.getUsername()) && password.equals(account.getPassword())) {
            System.out.println("Login successful!");

            boolean exit = false;

            while (!exit) {
                System.out.println("Account number: " + account.getAccountNumber());
                System.out.println("Balance: " + account.getBalance());

                //Menu
                System.out.println("Please select an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                int option = InputReader.readInt();

                switch (option) {
                    case 1 -> {
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = InputReader.readDouble();
                        bankService.deposit(account, depositAmount);
                    }
                    case 2 -> {
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = InputReader.readDouble();
                        bankService.withdraw(account, withdrawAmount);
                    }
                    case 3 -> System.out.println("Current balance: " + account.getBalance());
                    case 4 -> {
                        exit = true;
                        break;
                    }
                    default -> System.out.println("Invalid option selected");
                }
            }

        } else {
            System.out.println("Login failed. Invalid username or password");

        }
    }
}
