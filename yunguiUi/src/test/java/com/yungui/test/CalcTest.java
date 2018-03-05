package com.yungui.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.yungui.demo.Calc;
import com.yungui.testdata.TestDataFactory;

public class CalcTest {
	private Calc calc;
	@BeforeClass
	public void init() {
		calc = new Calc();
	}
	/*@DataProvider(name="calctestdata")
	public Object[][] calcTestData(){
		return new Object[][] {
			{10,20,30},
			{30,10,20},
			{30,30,60}
		};
	}*/
	
	@Test(dataProvider="calc_excel_test_data",dataProviderClass = TestDataFactory.class)
	public void testCompute(int x,int y,int expected) {
		Calc calc = new Calc();
		int actual = calc.compute(x, y);
		assertEquals(actual, expected);
	}
}
