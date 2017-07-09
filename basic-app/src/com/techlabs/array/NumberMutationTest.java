package com.techlabs.array;

public class NumberMutationTest {

	public static void main(String[] args) {
		testNumber();
		testNumberArray();
	}
	private static void testNumber() {
		int sal=5000;
		mutateNumber(sal);
		System.out.println(sal);
	}
	private static void mutateNumber(int salPassed) {
		salPassed = 0;
	}
	private static void testNumberArray() {
		int[] salaries = {5000, 6000, 7000};
		mutateNumberArray(salaries);
		for(int sal: salaries) {
			System.out.println(sal);
		}
	}
	private static void mutateNumberArray(int[] salariesPassed) {
		for(int index=0; index < salariesPassed.length; index++)
		{
			salariesPassed[index]=0;
		}
	}
}
