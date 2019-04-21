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

public class TestFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create inFile and outFile
		File inFile = new File("D:/test/in.txt");
		File outFile = new File("D:/test/out.txt");
		System.out.println(inFile.exists());
		System.out.println(outFile.exists());
		
		char[] ch = new char[20];
		
		FileWriter fw = null;	
		FileReader fr = null;		
		
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		
		int num = 0 ;
		try {
			isr = new InputStreamReader(new FileInputStream(inFile),"GBk");
			osw = new OutputStreamWriter(new FileOutputStream(outFile), "GBk");			
			
			while ((num = isr.read(ch))!=-1) {
				System.out.println(new String(ch, 0, num));
				osw.write(ch, 0, num);
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
					if(osw!=null){
						osw.close();
					}
					if(isr!=null){
						isr.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	
	}

}
