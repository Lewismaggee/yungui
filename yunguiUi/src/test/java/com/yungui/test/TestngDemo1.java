package com.yungui.test;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TestngDemo1 {
	@Test
	public void test1() {
		assertEquals(10, 1);
	}
	
	@Test(dependsOnMethods="test1") //test2依赖于test1,如果test1运行失败，则test2不运行
	public void test2() {
		assertEquals(10, 10);
	}
	
	@Test(dependsOnMethods="test1",alwaysRun=true) //test3依赖于test1，如果test1运行失败，但是test3仍然运行
	public void test3() {
		assertEquals(10, 10);
	}
	
	@Test(enabled=false) //关闭该测试
	public void test4() {
		assertEquals(1, 1);
	}
	
	@Test(invocationCount=4) //该测试运行4次
	public void test5() {
		assertEquals(1, 1);
	}
	
	@Test(invocationCount=4,threadPoolSize=4) //该测试运行4次,4个并发运行，不是先运行完成一个再运行另外一个
	public void test6() {
		assertEquals(1, 1);
	}
	
	@Test
	public void test7() {
		assertEquals(1, 2);
	}
}
