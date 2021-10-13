package org.clickMe.common.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class CmtDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int code;
	private int postCode;
	private String content;
	private java.sql.Date time;
	private String Yn;
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.sql.Date getTime() {
		return time;
	}
	public void setTime(java.sql.Date time) {
		this.time = time;
	}
	public String getYn() {
		return Yn;
	}
	public void setYn(String yn) {
		Yn = yn;
	}
	
	public CmtDTO() {
	}
	
	public CmtDTO(int code, int postCode, String content, Date time, String yn) {
		this.code = code;
		this.postCode = postCode;
		this.content = content;
		this.time = time;
		Yn = yn;
	}
	
	@Override
	public String toString() {
		return "CmtDTO [code=" + code + ", postCode=" + postCode + ", content=" + content + ", time=" + time + ", Yn="
				+ Yn + "]";
	}
}
