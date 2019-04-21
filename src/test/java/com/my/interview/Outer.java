package com.my.interview;

public class Outer {
	
	private static String msg = "======";
	
	public static class SInner{
		

		public void outData(){
			System.out.println( "I am a statuc  Inner Class"+msg) ;
			System.out.println(super.getClass()+"!!!!!!");
		}
	}
	
	public class Inner{

		public void outData(){
			System.out.println( "I am a Inner Class!" +msg);
		}
	}
	
	public void outData(){
		
		class MINner{
			
			public void outData(){
				System.out.println( "I am a Inner Class In Method!" +msg);
			}
			
		}
		
		new Thread(new Runnable() {
			public void run() {
				System.out.println("I don't have name!" +msg);
			}
		}).start();
		
		//use the inner class witch in the method
		new MINner().outData();
		
		//use normal inner class  
		new Inner().outData();
		
		//use the static inner class
		new SInner().outData();
		
		
	}

}
