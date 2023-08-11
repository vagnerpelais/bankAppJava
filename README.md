# Bank Terminal App

Bank Terminal App is a Java command-line application that simulates basic banking operations such as deposit, withdrawal, and balance check. It allows users to log in to their account and perform various banking operations

## Features

- User static login: Users can log in to their bank account by providing their username and password.
- Deposit: Users can deposit money into their account.
- Withdrawal: Users can withdraw money from their account.
- Balance check: Users can check their account balance.
- Menu-driven interface: Users are presented with a menu of options to choose from, and they can perform multiple operations without restarting the application.
- Error handling: The application provides appropriate error messages for invalid inputs and insufficient funds.

## Technologies Used

- Java
- Packages and classes
- Command-line interface
- Object-oriented programming principles

## Getting Started


### Prerequisites

- Java Development Kit 20 (JDK) installed
- Command-line interface (e.g., Terminal, Command Prompt)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/bank-terminal-app.git
   
   cd bank-terminal-app

   javac -d bin src/com/bank/*.java src/com/bank/model/*.java src/com/bank/service/*.java src/com/bank/util/*.java

   java -cp bin com.bank.BankApp
   ```

## Examples 

### Login:
```
Please enter your username:
johnDoe
Please enter your password:
pass123

Login Successful!
```
### Deposit::
```
Please select an option:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
   
1
Enter amount to deposit:
500
Deposit Successful. New balance: 1500.0
```
### Withdraw:
```
Please select an option:
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
   
2
Enter amount to withdraw:
700
Withdrawal Successful. New balance: 800.0
```
   
