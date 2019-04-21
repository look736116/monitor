package com.my.interview;

public enum Type {
	A("A"),
	B("B"),
	C("C"),
	D("D");
	
	private String typeName;

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * @param typeName the typeName to set
	 */
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	private Type(String typeName) {
		this.typeName = typeName;
	}
	
	

}
