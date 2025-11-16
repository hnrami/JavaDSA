package com.meybise.quickstart;

//------------------ Abstract Class with Static Block -------------------
public abstract class BankAccount implements Transaction  {


    private String accountNumber;
    private double balance;

    // Static variable
    static String bankName;

    // Static Block
    static {
        bankName = "HDFC Bank";
        System.out.println("Static Block: Bank initialized → " + bankName);
    }

    // Default Constructor
    public BankAccount() {
        this.accountNumber = "UNKNOWN"; // using this keyword
        this.balance = 0.0;
        System.out.println("BankAccount Default Constructor Called");
    }

    // Parameterized Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;   // this → current object
        this.balance = balance;
        System.out.println("BankAccount Parameterized Constructor Called");
    }

    // Encapsulation Getters
    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    // Abstract Method
    abstract double getInterestRate();

    // ---------------- Inner Class ----------------
    class StatementPrinter {
        void printStatement() {
            System.out.println("Statement for Account: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("------------------------------");
        }
    }
}
