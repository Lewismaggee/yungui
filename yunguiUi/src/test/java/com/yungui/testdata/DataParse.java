package com.yungui.testdata;

public class DataParse {
	public static Object double2int(double data) {
		if(data-(int)data == 0) {
			return (int)data;
		}else {
			return data;
		}
	}
}
