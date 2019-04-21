package com.my.model;

public enum UserState {
	Normal("N"),
	Frozen("F"),
	Cancle("C");
	private String userState;

	private UserState(String userState) {
		this.userState = userState;
	}

	/**
	 * @return the userState
	 */
	public String getUserState() {
		return userState;
	}

	/**
	 * @param userState the userState to set
	 */
	public void setUserState(String userState) {
		this.userState = userState;
	}

	
	
	

}
