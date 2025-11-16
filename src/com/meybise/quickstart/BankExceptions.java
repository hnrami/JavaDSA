package com.meybise.quickstart;

public class BankExceptions {

	public static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String msg) { super(msg); }
    }

    public static class InvalidAccountException extends Exception {
        public InvalidAccountException(String msg) { super(msg); }
    }
}
