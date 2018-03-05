package com.yungui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeTestngDemo3Class ....");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterTestngDemo3Class ....");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod ....");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMehtod ....");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 .....");
	}
	
	@Test
	public void test4() {
		System.out.println("test4 .....");
	}
}	
