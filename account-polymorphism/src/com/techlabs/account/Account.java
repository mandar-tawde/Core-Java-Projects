package com.techlabs.account;

public abstract class Account {
	private final String accountNo;
	private final String name;
	protected float balance;

	public Account(String accountNo, String name, float balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(float amount) {
		if (amount > 0)
			balance = balance + amount;
	}

	public abstract void withdraw(float amount);

	public float getBalance() {
		return balance;
	}

	public String getInfo() {
		return "\nAccount No : " + accountNo + "\nName       : " + name
				+ "\nBalance    : Rs " + balance;
	}
}
