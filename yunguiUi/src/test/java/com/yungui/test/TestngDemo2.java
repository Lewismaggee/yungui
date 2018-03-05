package com.yungui.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeTestngDemo2Class ....");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterTestngDemo2Class ....");
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
	public void test1() {
		System.out.println("test1 .....");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 .....");
	}
}	
