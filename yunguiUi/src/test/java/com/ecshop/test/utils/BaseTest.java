package com.ecshop.test.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ecshop.webdriver.utils.WebDriverUtils;
import com.yungui.testdata.ConfigReader;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = WebDriverUtils.getDriver(ConfigReader.getConfig(ConfigReader.BROWSER),this.getClass());
		String waitTime = ConfigReader.getConfig(ConfigReader.WAITTIME);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
