package com.techlabs.accounts;

public class CurrentAccount implements IAccount {

	private double balance;

	public CurrentAccount(double balance) {
		if (balance < 0)
			balance = 0;
		this.balance = balance;
	}

	@Override
	public double deposit(double amount) {
		if (amount > 0)
			balance = balance + amount;

		return balance;
	}

	@Override
	public double withdraw(double amount) {
		if (balance - amount >= -10000)
			balance = balance - amount;

		return balance;
	}

}
