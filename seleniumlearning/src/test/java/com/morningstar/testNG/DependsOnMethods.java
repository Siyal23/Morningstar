package com.morningstar.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test(dependsOnMethods = "testCase1")
	/*
	 *the Assert.assertEquals("xyz", "abc"); will give false because
	 *actual and expected value is different(this we did only to demonstrate depends on method)
	 *so the testcase 2 will be failed.
	 * 
	 * */
	public void testCase2() {
		Assert.assertEquals("xyz", "abc");
		System.out.println("Test Case 2");
	}
	
	/*
	 * Since test case 2 is failed and test case 3 depends on test case 2,
	 * test case 3 will be skipped and only test case 1 will be executed.
	 * */
	@Test(dependsOnMethods = "testCase2")
	public void testCase3() {
		System.out.println("Test Case 3");
	}
}
