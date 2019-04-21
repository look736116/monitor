package com.my.interview;

import java.io.File;

public class FindFiles {
	
	public void findFiles(File file){		
		
		File[] files = file.listFiles();
		
		for (File file2 : files) {
			
			if (file2.isDirectory()) {
				findFiles(file2);
				
			}else{
				System.out.println(file2.getAbsolutePath());
			}
			
		}
		
	}
	
	public void color(int num){
		
		for (int i = 0; i < num; i++) {
			if((i+1)%3==0){
				System.out.println("红");
			}
			
			if((i+1)%3==1){
				System.out.println("绿");
			}
			
			if((i+1)%3==2){
				System.out.println("蓝");
			}
		}
		
		
		
	}

}
