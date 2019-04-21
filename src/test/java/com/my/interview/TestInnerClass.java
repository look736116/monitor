package com.my.interview;

public class TestInnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outData();
		
		new Outer.SInner().outData();
		outer.new Inner().outData();
	}

}
