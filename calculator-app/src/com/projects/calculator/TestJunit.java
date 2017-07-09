package com.projects.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestJunit {

	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(12, c.add(5, 7));
	}

	@Test
	public void testAddWrong() {
		assertEquals(12, c.addWrong(5, 7));
	}
}
