package com.app.domain.status;

public enum ReplyStatus {
	ENABLE("enable"), DISABLE("disable");

	private final String value;

	private ReplyStatus(String value) {
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
