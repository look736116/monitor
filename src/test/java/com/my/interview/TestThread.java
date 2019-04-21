package com.my.interview;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Thread thread1 = new Thread(new MyThread());
		thread1.start();
		try {
			Thread.sleep(2000);
			thread1.interrupt();
			
			System.out.println(thread1.isInterrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
