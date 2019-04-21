package com.my.interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create inFile and outFile
		File inFile = new File("D:/test/java.zip");
		File outFile = new File("D:/test/out.zip");
		System.out.println(inFile.exists());
		System.out.println(outFile.exists());
		
		char[] ch = new char[20];
		byte[] bs = new byte[1024];
		
		FileWriter fw = null;	
		FileReader fr = null;		
		
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		
		
		int count = 0;
		int num = 0 ;
		try {
			inputStream = new FileInputStream(inFile);
			outputStream = new FileOutputStream(outFile);		
			
			while ((num = inputStream.read(bs))!=-1) {
				System.out.println(count++);
				outputStream.write(bs, 0, num);
			}		

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		
				try {
					if(fw!=null){
						fw.close();
					}
					if(fr!=null){
						fr.close();
					}
					if(outputStream!=null){
						outputStream.close();
					}
					if(inputStream!=null){
						inputStream.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
	}

}
