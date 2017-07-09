package com.techlabs.account.test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.account.Account;
import com.techlabs.account.InsufficientFundException;

public class JUnitTest {
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	Account account = new Account(1020, "Mandar", 20000);

	@Test
	public void should_return_Mandar_on_getName() {
		assertEquals("Mandar", account.getName());
	}

	@Test
	public void should_return_20000_on_getBalance() {
		assertEquals(20000, account.getBalance(), 0.0);
	}

	@Test
	public void should_return_15000_on_withdrawing_5000() {
		assertEquals(15000, account.withdraw(5000), 0.0);
	}

	@Test
	public void should_not_withdraw_19501_on_balance_20000() {
		exception.expect(InsufficientFundException.class);
		account.withdraw(19501);
	}

}
