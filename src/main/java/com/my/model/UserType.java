package com.my.model;

public enum UserType {
	Adamin("A"),
	VIP("V"),
	User("U");
	private String userType;

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	private UserType(String userType) {
		this.userType = userType;
	}
	
	

}
