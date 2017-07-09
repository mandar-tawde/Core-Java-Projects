package com.techlabs.accounts;

public class CurrentAccountFactory implements IAccountFactory {

	@Override
	public IAccount make() {
		return new CurrentAccount(0);
	}

}
