package com.my.interview;

public class MyThread implements Runnable{

	@Override
	public  void run() {

		// TODO Auto-generated method stub
		for (int i = 0; i < 1000000; i++) {
			if(Thread.interrupted()){
				break;
			}
		
		System.out.println(Thread.currentThread().getName() +" : " + Thread.currentThread().getId() + "==" +i);
			
			
		
		}
	
		
	}
	

}
