package org.clickMe.common.model.dto;

import java.io.Serializable;

public class EntCatDTO implements Serializable {
	private static final long serialVersionUID = -4439591312017362895L;
	
	private int code;
	private String type;

	public EntCatDTO() {
	}

	public EntCatDTO(int code, String type) {
		this.code = code;
		this.type = type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EntCatDTO [code=" + code
				+ ", type=" + type + "]";
	}
	
}
