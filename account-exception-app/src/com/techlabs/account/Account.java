package com.techlabs.account;

public class Account {
	private final int accountNumber;
	private final String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public double withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			return balance;
		}
		throw (new InsufficientFundException(this, amount));
	}
}
