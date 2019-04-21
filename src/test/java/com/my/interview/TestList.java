package com.my.interview;

import java.util.ArrayList;

public class TestList {
	
	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<String>();
		lists.add(0,"0");
		lists.add(1,"1");
		lists.add(2,"2");
		lists.add(3,"3");
		lists.add("4");
		lists.add(3,"999999");
		
		
		
		
		
		for (String string : lists) {
			System.out.println(string+"");
		}
		
	}

}
