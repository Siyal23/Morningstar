package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.morningstar.lab.NumMonthToWords;


public class TestNumMonthToWords {
	
	NumMonthToWords target;
	
	@Before
	public void setup() {
		target=new NumMonthToWords();
		
	}
	
	@Test
	public void testIfMonthNumberIsConvertedToTextMonth() {
		assertEquals("January",target.convertMonthToWords(1));
	}
		
	@After
	public void teardown() {
		target=null;
	}
}
