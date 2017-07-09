package com.techlabs.account;

public class InsufficientFundException extends RuntimeException {

	private static final long serialVersionUID = 6929117926759525503L;
	private String messageString;

	public InsufficientFundException(Account account, Double amount) {
		messageString = "Insufficient Funds\n" + account.getName()
				+ " holding account number " + account.getAccountNumber()
				+ " with balance Rs " + account.getBalance()
				+ " is withdrawing Rs " + amount;
	}

	@Override
	public String getMessage() {
		return messageString;
	}

}
