package com.my.test;

public class TestOuter {
	
	public static int num = 89;
	
	
	public static class SInner {
		public void outData(){
			System.out.println("Static Inner Class!");
		}
	}
	
	public  class Inner {
		public void outData(){
			System.out.println("Normal Inner Class!");
		}
	}
	
	public void outData(){
		class MInner{
			void outData(){
				System.out.println("Inner Class In Method!");
			}
		}
		
		new Thread(
		new Runnable() {
			public void run() {
				System.out.println("I don't have name!");
			}
		}).start();
		
		
		new SInner().outData();
		new Inner().outData();
		new MInner().outData();
	}

}
