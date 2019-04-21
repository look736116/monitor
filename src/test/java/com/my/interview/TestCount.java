package com.my.interview;

public class TestCount {

	public int count(int... a) {
		int count = 0;
		for (int i : a) {
			count += i;
		}
		return count;
	}

}
