package com.morningstar;

/*static import
* i can import a method of the class using static import.new feature of java 5
* if i dont use static import then i can say Assert.fail().
*/
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/*
 * There are some annotations
 * @Test-this means this is a test code or test case.JUnit 
 * test case is a smallest piece of code written to test original code
 * 
 * 
 * */
public class FirstUnitTest {

	/*
	 * To execute a method before executing a test case use @Before.
	 * It will execute each time for EVERY TEST METHOD.
	 * If you want to do some initialization task you can do it.
	 * */
	@Before
	public void setup() {
		System.out.println("Setup Method");
	}
	/*
	 * To execute a method after executing a test case.It will 
	 * execute each time for EVERY TEST METHOD
	 * */
	@After
	public void teardown() {
		System.out.println("teardown Method");
	}
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
	}
	@Test
	public void test3() {
		//fail("Not yet implemented");
	}
}
