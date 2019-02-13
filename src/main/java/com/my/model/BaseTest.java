package com.my.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_test")
public class BaseTest {
	
	@Id
    @Column(name="Test_Id")
    private int testId;
    
    @Column(name="Test_Name")
    private String testName;

	

	/**
	 * @return the testId
	 */
	public int getTestId() {
		return testId;
	}

	/**
	 * @param testId the testId to set
	 */
	public void setTestId(int testId) {
		this.testId = testId;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseTest [testId=" + testId + ", testName=" + testName + "]";
	}
    
    

}
