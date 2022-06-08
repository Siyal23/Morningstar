package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringManipulationTestCase {
	
	private StringManipulation target=null;
	
	@Before
	public void setup(){
		target=new StringManipulation();
	}	
	
	/*
	 * @Test(expected=IllegalArgumentException.class) public void
	 * testdoOperationMethodAcceptThreeArguments(){ target.doOperation(); }
	 */
	@Test
	public void testDoOperationShouldReturnConcatenationOfTwoString() {
		String result=target.doOperation("Morningstar", "+","India");
		assertEquals("MorningstarIndia",result);
	}
	
	@Test
	public void testDoOperationShouldMinusSecondStringFromFirstString() {
		String result=target.doOperation("HelloWorld", "-", "World");
		assertEquals("Hello", result);
		assertEquals("Morningstar",target.doOperation("Morningstar", "-","India"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDoOperationShouldThrowIllegalArgumenException() {
		target.doOperation("Morningstar", "*", "India");
	}
	
	@After
	public void teardown() {
		target=null;
	}
}
