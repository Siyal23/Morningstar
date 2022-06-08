package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{
   
	App target;
	
	@Before
	public void setup() {
		target=new App();
	}
	
    @Test
    public void shouldBeAbleToAddTwoNumbers()
    {
        assertEquals(20, target.addition(10, 10));
    }
    
    @After
    public void terminate() {
    	target=null;
    }
}
