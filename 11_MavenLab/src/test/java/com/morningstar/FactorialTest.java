package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	Factorial target;
	@Before
	public void setUp() {
		target=new Factorial();
	}

	@After
	public void tearDown() {
		target=null;
	}

	@Test
	public void testIfCorrectFactorialNumberIsCalculated() {
		assertEquals(120, target.getFactorial(5));
	}

}
