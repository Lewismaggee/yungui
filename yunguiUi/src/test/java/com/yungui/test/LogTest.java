package com.yungui.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LogTest {
	private static Logger logger = LogManager.getLogger();
	
	@Test
	public void test1() {
		logger.info("1哈哈,test1!!!");
	}
	
	@Test
	public void test2() {
		logger.warn("2哈哈,test2!!!");
	}
	
	@Test
	public void test3() {
		logger.debug("3哈哈,test3!!!");
	}
	
	@Test
	public void test4() {
		logger.error("4哈哈,test4!!!");
	}
}
