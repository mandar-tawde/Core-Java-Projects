package com.techlabs.accounts;

public class SavingAccountFactory implements IAccountFactory {

	@Override
	public IAccount make() {
		return new SavingAccount(0);
	}

}
