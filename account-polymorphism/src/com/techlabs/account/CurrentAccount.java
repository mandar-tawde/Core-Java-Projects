package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(String accountNo, String name, float balance) {
		super(accountNo, name, balance);
	}

	@Override
	public void withdraw(float amount) {
		if (balance - amount >= -10000)
			balance = balance - amount;
	}

}
