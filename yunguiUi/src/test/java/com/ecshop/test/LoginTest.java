package com.ecshop.test;

import org.testng.annotations.Test;

import com.ecshop.pages.IndexPage;
import com.ecshop.pages.LoginPage;
import com.ecshop.test.utils.BaseTest;
import com.yungui.testdata.TestDataFactory;

public class LoginTest extends BaseTest{
	@Test(dataProvider="ecshop_login_data",dataProviderClass=TestDataFactory.class)
	public void loginTest1(String username,String password,String result) {
		driver.get("http://localhost/ecshop");
		IndexPage indexPage = new IndexPage(driver);
		indexPage.goLogin();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.doLogin(username, password);
		loginPage.assertLoginResult(result);
	}
	
}
