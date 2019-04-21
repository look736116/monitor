package com.my.test;

public interface NewInterface {
	
	public default String outData1(){
		return "1111";
	}
	
	public default String outData2(){
		return "2222";
	}
	}
