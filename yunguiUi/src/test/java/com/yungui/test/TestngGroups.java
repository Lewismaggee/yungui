package com.yungui.test;

import org.testng.annotations.Test;

public class TestngGroups {
	@Test(groups= {"windows.g1"})
	public void test1() {
		System.out.println("test1 .......");
	}
	@Test(groups= {"windows.g2"})
	public void test2() {
		System.out.println("test2 .......");
	}
	@Test(groups= {"linux.g1","windows.g1"})
	public void test3() {
		System.out.println("test3 .......");
	}
	@Test(groups= {"linux.g2"})
	public void test4() {
		System.out.println("test4 .......");
	}
}
