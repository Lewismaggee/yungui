package com.yungui.testdata;

import org.testng.annotations.DataProvider;

public class TestDataFactory {
	@DataProvider(name="calc_test_data")
	public static Object[][] getCalcTestData(){
		return new Object[][] {
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
	}
	
	@DataProvider(name="calc_excel_test_data")
	public static Object[][] getCalcExcelData(){
		return ReadExcelUtils.getExcelData("calcTestData.xlsx");
	}
	
	@DataProvider(name="ecshop_login_data")
	public static Object[][] getEcshopLoginData(){
		return ReadCSVUtils.getPlainCSVData("ecshopLoginTestData.csv");
	}
}
