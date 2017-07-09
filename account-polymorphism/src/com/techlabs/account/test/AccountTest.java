package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount savingAcc = new SavingAccount("S001", "Mandar Tawde",
				50000);
		CurrentAccount currentAcc = new CurrentAccount("C001", "Pankaj Pan",
				30000);
		printInfo(savingAcc);
		printInfo(currentAcc);
		savingAcc.deposit(10000);
		currentAcc.deposit(20000);
		printInfo(savingAcc);
		printInfo(currentAcc);
		savingAcc.withdraw(50000);
		currentAcc.withdraw(60000);
		printInfo(savingAcc);
		printInfo(currentAcc);
	}

	public static void printInfo(Account acc) {
		System.out.println(acc.getInfo());
	}
}
