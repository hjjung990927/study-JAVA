package com.app.domain.member;

public enum MemberGender {
	MAN("남"), WOMAN("여"), NONE("선택 안함");
	
	private final String value;

	private MemberGender(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public static MemberGender getEnum(String value) {
		for(MemberGender memberGender : MemberGender.values()) {
			if(memberGender.value.equals(value)) {
				return memberGender;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
