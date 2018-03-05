package com.yungui.test;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class MyListenner extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
//		super.onTestFailure(tr);
		String methodName = tr.getMethod().getMethodName();
		Reporter.log("测试方法"+methodName+"执行失败了");
		System.err.println("------>"+methodName);
	}
	
}
