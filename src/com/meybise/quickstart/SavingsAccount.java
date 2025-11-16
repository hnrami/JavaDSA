package com.meybise.quickstart;


//------------------- Inheritance + super keyword ---------------------
public class SavingsAccount extends BankAccount {

	// Default constructor
    public SavingsAccount() {
        super();  // Calls parent default constructor
        System.out.println("SavingsAccount Default Constructor");
    }

    // Parameterized constructor
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance); // super → call parent constructor
        System.out.println("SavingsAccount Parameterized Constructor");
    }

    @Override
    public double getInterestRate() {
        return 4.5;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Savings Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 1000) {
            System.out.println("Minimum balance of 1000 must remain.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Savings Withdraw: " + amount);
        }
    }
}    