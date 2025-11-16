package com.meybise.quickstart;


//------------------- Polymorphism Demo -------------------
public class BankingDemo {

	
	
	// Static method
    static void showBankWelcomeMessage() {
        System.out.println("Welcome to HDFC Bank!");
    }

    public static void main(String[] args) {

        // Call static method
        BankingDemo.showBankWelcomeMessage();

        // Polymorphism → parent reference
        BankAccount acc1 = new SavingsAccount("SA001", 5000);
        BankAccount acc2 = new CurrentAccount("CA001", 8000);

        acc1.deposit(1000);
        acc2.withdraw(2000);

        // Default method of interface
        acc1.showTransactionLimit();

        // Using inner class
        BankAccount.StatementPrinter sp = acc1.new StatementPrinter();
        sp.printStatement();
    }
}
