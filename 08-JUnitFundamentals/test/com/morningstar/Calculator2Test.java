package com.morningstar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator2Test {

	Calculator2 calculator2;
	@Before
	public void setup() {
		calculator2=new Calculator2();
	}
	
	@Test(expected = ArithmeticException.class)
	public void testToCheckArithmeticException() {
		calculator2.divide(10, 0);
	}
	
	@After
	public void terminate() {
		
	}
}
