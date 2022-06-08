package com.morningstar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPosNeg {

	PosNeg target;
	@Before
	public void setUp() throws Exception {
		target=new PosNeg();
	}

	@After
	public void tearDown(){
		target=null;
	}

	@Test
	public void test() {
		assertTrue(target.PNnum(2));
	}

	
}
