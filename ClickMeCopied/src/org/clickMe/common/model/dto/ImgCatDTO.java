package org.clickMe.common.model.dto;

import java.io.Serializable;

public class ImgCatDTO implements Serializable {
	private static final long serialVersionUID = 5289797929261173089L;
	
	private int code;
	private String name;
	private String path;
	
	public ImgCatDTO() {
	}

	public ImgCatDTO(int code, String name, String path) {
		this.code = code;
		this.name = name;
		this.path = path;
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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return "ImgCatDTO [code=" + code
				+ ", name=" + name
				+ ", path=" + path + "]";
	}
	
}
