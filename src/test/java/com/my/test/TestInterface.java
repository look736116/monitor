package com.my.test;

public class TestInterface implements C {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(A.x);
		
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println(B.x);
		
	}

	@Override
	public void jow() {
		// TODO Auto-generated method stub
		System.out.println(C.x);
		
	}

}


interface A{
	int x = 0;
	void play();
}

interface B{
	int x = 0;
	void say();
}

interface C extends A,B{
	int x = 11;
	
	void jow();
}

