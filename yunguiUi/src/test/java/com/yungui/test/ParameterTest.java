package com.yungui.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	@Parameters(value= {"name","age"})
	@Test
	public void test1(String name,int age) {
		System.out.println("---->"+name+", "+age);
	}
}
