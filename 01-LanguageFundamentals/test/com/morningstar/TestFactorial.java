package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.morningstar.lab.Factorial;

public class TestFactorial {
	
	private Factorial target=null;
	@Before
	public void setup() {		
		target=new Factorial();
	}
	
	@Test
	public void testIfCorrectFactorialNumberIsCalculated() {
		assertEquals(120, target.getFactorial(5));
	}
	
	@After
	public void teardown() {
		target=null;
	}
	
}
