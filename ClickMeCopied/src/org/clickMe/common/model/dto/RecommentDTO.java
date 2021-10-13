package org.clickMe.common.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class RecommentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3803272163819491044L;
	private int code;
	private int cmtCode;
	private String reCommentContent;
	private java.sql.Date reCommentTime;
	private String reCommentYn;

	public RecommentDTO(int code, int cmtCode, String reCommentContent, Date reCommentTime, String reCommentYn) {
		this.code = code;
		this.cmtCode = cmtCode;
		this.reCommentContent = reCommentContent;
		this.reCommentTime = reCommentTime;
		this.reCommentYn = reCommentYn;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCmtCode() {
		return cmtCode;
	}

	public void setCmtCode(int cmtCode) {
		this.cmtCode = cmtCode;
	}

	public String getReCommentContent() {
		return reCommentContent;
	}

	public void setReCommentContent(String reCommentContent) {
		this.reCommentContent = reCommentContent;
	}

	public java.sql.Date getReCommentTime() {
		return reCommentTime;
	}

	public void setReCommentTime(java.sql.Date reCommentTime) {
		this.reCommentTime = reCommentTime;
	}

	public String getReCommentYn() {
		return reCommentYn;
	}

	public void setReCommentYn(String reCommentYn) {
		this.reCommentYn = reCommentYn;
	}

	@Override
	public String toString() {
		return "RecommentDTO [code=" + code + ", cmtCode=" + cmtCode + ", reCommentContent=" + reCommentContent
				+ ", reCommentTime=" + reCommentTime + ", reCommentYn=" + reCommentYn + "]";
	}

}
