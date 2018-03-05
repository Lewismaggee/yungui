package com.ecshop.test.utils;

import org.testng.annotations.AfterSuite;

import com.ecshop.webdriver.utils.WebDriverUtils;

public class AfterEcshopTest {
	@AfterSuite
	public void stopService() {
		WebDriverUtils.stopService();
	}
}
