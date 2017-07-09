package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(231, "Mr. Mandar Tawde", 20000d);
		System.out.println(account.withdraw(19501d));
	}
}
