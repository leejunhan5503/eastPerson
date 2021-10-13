package org.clickMe.common.model.dto;

public class InquiryType implements java.io.Serializable {

	private static final long serialVersionUID = 1974348914846639079L;

	private int code;
	private String inqType;
	
	public InquiryType() {
	}

	public InquiryType(int code, String inqType) {
		this.code = code;
		this.inqType = inqType;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getInqType() {
		return inqType;
	}

	public void setInqType(String inqType) {
		this.inqType = inqType;
	}

	@Override
	public String toString() {
		return "InquiryType [code=" + code + ", inqType=" + inqType + "]";
	}

	
}
