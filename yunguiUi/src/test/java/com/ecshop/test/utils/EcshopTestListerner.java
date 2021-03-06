package com.ecshop.test.utils;

import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

public class EcshopTestListerner extends TestListenerAdapter{
	WebDriver driver;
	@Override
	public void onTestFailure(ITestResult tr) {
		String methodName = tr.getMethod().getMethodName();
		Object obj = tr.getInstance();
		Class<?> clazz = obj.getClass();
		try {
			Field field = clazz.getField("driver");
			driver = (WebDriver)field.get(obj);
			System.out.println(driver);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "screenshot";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		
		String filename = clazz.getName()+"."+methodName+"_"+sdf.format(new Date())+".png";
		File filepath = new File(path,filename);
		screenshot.renameTo(filepath);
		
		Reporter.log("<label style='color:red'>"+methodName+"执行失败,详情请查看日志,截图存放在screenshot目录中</label>");
	}
}
