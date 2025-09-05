package com.app.domain.status;

public enum PostStatus {
	ENABLE("enable"), DISABLE("disable");
	
	private final String value;

	private PostStatus(String value) {
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
