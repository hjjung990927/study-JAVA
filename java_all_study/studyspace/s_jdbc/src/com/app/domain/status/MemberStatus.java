package com.app.domain.status;

public enum MemberStatus {
	ENABLE("enable"), DISABLE("disable");
	
	private final String value;

	private MemberStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}	
	
	@Override
	public String toString() {
		return value;
	}
}
