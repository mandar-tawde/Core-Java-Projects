package com.techlabs.accounts.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.techlabs.accounts.IAccount;
import com.techlabs.accounts.IAccountFactory;

public class AccountFactoryTest {

	public static void main(String[] args) throws Exception,
			IllegalAccessException, ClassNotFoundException {

		Properties properties = new Properties();
		InputStream inputStream = new FileInputStream("res/config.properties");
		properties.load(inputStream);

		String factoryName = properties.getProperty("factory");

		IAccountFactory accountFactory = (IAccountFactory) Class.forName(
				factoryName).newInstance();

		IAccount account = accountFactory.make();

		System.out.println(account.deposit(50000));
		System.out.println(account.withdraw(20000));

	}
}
