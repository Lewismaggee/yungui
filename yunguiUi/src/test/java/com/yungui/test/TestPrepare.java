package com.yungui.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestPrepare {
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest......");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest.......");
	}
}
