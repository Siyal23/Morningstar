package com.morningstar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	/*
	 * Naming Convention is very important.
	 * Test Method name should reflect what is the purpose of your test case.
	 * */
	@Test
	public void testAdditionShouldReturnSumOfTwoNumber() {
		/*
		 * i used instance variable name as "target" that means this is the main
		 * target method that i am testing. so that it is easy to know if you have many 
		 * such instance variable in this method.
		 * */
		Calculator target=new Calculator();
		int result=target.addition(1000,2000);
		assertEquals(3000,result);
		assertEquals(1200,target.addition(1000, 200));
		assertEquals(1200,target.addition(900, 300));
		assertEquals(1200,target.addition(1100, 100));
		assertEquals(1200,target.addition(1900, -700));
	}
	
	/*
	 * If you want to execute only this method and not the above method the
	 * select method name by double clicking->right click->run as->junit
	 * */
	@Test
	public void testSumShouldReturnSumOfAllNumbers() {
		Calculator target=new Calculator();
		assertEquals(60,target.addition(10,20,30));
		assertEquals(100,target.addition(10,20,30,40));
		assertEquals(3,target.addition(1,2));
		assertEquals(6,target.addition(1,2,3));
	}
	/*I dont want to know if adding two numbers is working . i want to know if exception comes
	 * then only my test case should pass.
	 * */
	@Test(expected=IllegalArgumentException.class)
	public void testSumShouldThrowIllegalArgumentException() {
		Calculator target=new Calculator();
		target.addition(10);
	}
	/*
	 * this will show green bar because out motto is satisfied.
	 * we got exception that we got.if we give correct input say (10,20)
	 * then test case will fail because it did'nt throw an exception.
	 * 
	 * If i have more than one exception in my method.then i will create 
	 * separate test case for that.
	 */
}



