package com.techlabs.singleton.enum_based.test;

import com.techlabs.singleton.enum_based.EnumSingleton;

public class EnumSingletonTest {

	public static void main(String[] args) {
		System.out.println(EnumSingleton.INSTANCE);
		EnumSingleton.INSTANCE.work();
	}
}
