package org.clickMe.common.model.dto;

import java.io.Serializable;

public class ReportDTO implements Serializable{

	private static final long serialVersionUID = -8180867708829928474L;

	private int code;
	private int postCode;
	private String reason;
	
	public ReportDTO() {
	}
	
	public ReportDTO(int code, int postCode, String reason) {
		this.code = code;
		this.postCode = postCode;
		this.reason = reason;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	@Override
	public String toString() {
		return "ReportDTO [code=" + code + ", postCode=" + postCode + ", reason=" + reason + "]";
	}
	
}
