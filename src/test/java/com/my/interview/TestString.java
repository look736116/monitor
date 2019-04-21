package com.my.interview;

public class TestString {
	public static void main(String[] args) {
		Long l1 = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 20000; i++) {
			str +=i;			
		}
		Long l2 = System.currentTimeMillis();
		
		System.out.println(l2-l1);
		
		Long l3 = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 200000; i++) {
			sb.append(i);		
		}
		Long l4 = System.currentTimeMillis();
		
		System.out.println(l4-l3);
		
		
		Long l5 = System.currentTimeMillis();
		StringBuilder sbd = new StringBuilder();
		for (int i = 0; i < 200000; i++) {
			sbd.append(i);		
		}
		Long l6 = System.currentTimeMillis();
		
		System.out.println(l6-l5);
	}

}
