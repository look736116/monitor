package com.my.interview;

import java.util.Date;
import java.util.UUID;

public class Test {
	public static void main(String[] args) {
		int num = 8;
		try {
			if(num == 8){
				throw new MyException("E001","Can not be 8!");
			}
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getExceptionMsg());
		}
		
		Date date = new Date(1555730914826l);
		
		System.out.println(date.toString());
		
		System.out.println(UUID.randomUUID().toString().replace("-", "").toUpperCase());
				
		
	}

}
