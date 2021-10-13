package org.clickMe.common.model.dto;

import java.io.Serializable;

public class PostCatDTO implements Serializable{

	private static final long serialVersionUID = -7689960770248576420L;

	private int code;
	private String name;
	
	public PostCatDTO() {
		
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public PostCatDTO(int code, String name) {
		this.code = code;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "PostCatDTO [code=" + code + ", name=" + name + "]";
	}
}
