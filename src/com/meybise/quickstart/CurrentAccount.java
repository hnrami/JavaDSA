package com.meybise.quickstart;


//------------------- Another Child Class ---------------------

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double getInterestRate() {
        return 0.0; // Current accounts have no interest
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Current Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient balance!");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Current Withdraw: " + amount);
        }
    }
}  