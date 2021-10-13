package org.clickMe.common.model.dto;

import java.io.Serializable;

public class AuthenticDTO implements Serializable {
	private static final long serialVersionUID = 1527711434134588120L;
	
	private int code;
	private String status;
	
	public AuthenticDTO() {
	}

	public AuthenticDTO(int code, String status) {
		this.code = code;
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AuthenticDTO [code=" + code
				+ ", status=" + status + "]";
	}
	
}
