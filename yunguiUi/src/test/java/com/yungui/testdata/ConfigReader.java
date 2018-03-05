package com.yungui.testdata;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties props;
	public static final String BROWSER = "browser";
	public static final String WAITTIME = "waitTime";
	
	static {
		props = new Properties();
		
		InputStream is = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getConfig(String name) {
		return props.getProperty(name);
	}
}
