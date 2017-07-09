package com.techlabs.account;

public class SavingAccount extends Account {

	public SavingAccount(String accountNo, String name, float balance) {
		super(accountNo, name, balance);
	}

	@Override
	public void withdraw(float amount) {
		if (balance - amount >= 500) {
			balance = balance - amount;
		}
	}
}
