package com.techlabs.stacktrace;

public class StackTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void m1() throws Exception {
		m2();
	}
	
	private static void m2() throws Exception {
		m3();
	}
	
	private static void m3() throws Exception {
		throw (new Exception("Error"));
	}
}
