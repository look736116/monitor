package com.my.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.cglib.core.Local;

public class TestClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("11", "ssss");
		student.setAddress(new Address("ZZ"));
		
		try {
			Student student2 = (Student) student.clone();
			student.setAddress(new Address("GX"));
			student.setStuId("22");
			student.setStuName("898");
			System.out.println(student);
			System.out.println(student2);	
			Lock lock = new ReentrantLock();
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
