package org.clickMe.common.model.dto;

import java.io.Serializable;

public class ImgfileDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3397402052630757434L;

	private int code;
	private int imgCatCode;
	private int inqCode;
	private int postCode;
	private int reviewCode;
	private String origName;
	private String uuidName;

	public ImgfileDTO(int code, int imgCatCode, int inqCode, int postCode, int reviewCode, String origName,
			String uuidName) {
		this.code = code;
		this.imgCatCode = imgCatCode;
		this.inqCode = inqCode;
		this.postCode = postCode;
		this.reviewCode = reviewCode;
		this.origName = origName;
		this.uuidName = uuidName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getImgCatCode() {
		return imgCatCode;
	}

	public void setImgCatCode(int imgCatCode) {
		this.imgCatCode = imgCatCode;
	}

	public int getInqCode() {
		return inqCode;
	}

	public void setInqCode(int inqCode) {
		this.inqCode = inqCode;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public int getReviewCode() {
		return reviewCode;
	}

	public void setReviewCode(int reviewCode) {
		this.reviewCode = reviewCode;
	}

	public String getOrigName() {
		return origName;
	}

	public void setOrigName(String origName) {
		this.origName = origName;
	}

	public String getUuidName() {
		return uuidName;
	}

	public void setUuidName(String uuidName) {
		this.uuidName = uuidName;
	}

	@Override
	public String toString() {
		return "ImgfileDTO [code=" + code + ", imgCatCode=" + imgCatCode + ", inqCode=" + inqCode + ", postCode="
				+ postCode + ", reviewCode=" + reviewCode + ", origName=" + origName + ", uuidName=" + uuidName + "]";
	}

}
