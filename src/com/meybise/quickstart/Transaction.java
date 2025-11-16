package com.meybise.quickstart;

//--------------------- Interface with Default Method ---------------------
public interface Transaction {
	
	
	void deposit(double amount);
    void withdraw(double amount);
    
    // Default Method
    default void showTransactionLimit() {
        System.out.println("Daily transaction limit: ₹50,000");
    }

}
