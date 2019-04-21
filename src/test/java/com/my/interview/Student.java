package com.my.interview;

public class Student implements Cloneable {
	
	private String stuId;
	
	private String stuName;
	
	private Address address;

	/**
	 * @return the stuId
	 */
	public String getStuId() {
		return stuId;
	}

	/**
	 * @param stuId the stuId to set
	 */
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	/**
	 * @return the stuName
	 */
	public String getStuName() {
		return stuName;
	}

	/**
	 * @param stuName the stuName to set
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Student(String stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", address=" + address + "]";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student student = (Student) super.clone();
		if(address!=null){
			student.setAddress((Address)address.clone());
		}
		return student;
	}

}
