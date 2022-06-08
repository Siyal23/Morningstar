package com.morningstar;

import org.junit.Before;
import org.junit.Test;

import exception13.Main;

class TestHockey {

	
	Main target=null;
	@Before
	public void setup() {
		target=new Main();
	}
	
	@Test(expected = RuntimeException.class)
	void testShouldReturnRuntimeException() {
		
	}

}
