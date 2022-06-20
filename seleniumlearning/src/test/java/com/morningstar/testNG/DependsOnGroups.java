package com.morningstar.testNG;

import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(groups = {"smokeTesting","regressionTesing"})
	public void testCase1() {
		System.out.println("Test Case 1");
	}
	
	@Test(groups = {"sanityTesting","regressionTesing"})
	public void testCase2() {
		System.out.println("Test Case 2");
	}
		
	@Test(groups = {"reTesing","sanityTesing"})
	public void testCase3() {
		System.out.println("Test Case 3");
	}
}
