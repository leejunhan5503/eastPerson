package org.clickMe.common.model.dto;

import java.io.Serializable;
import java.sql.Date;

import oracle.sql.NUMBER;

public class PostDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private int code;
	private int sellerCode;
	private int buyerCode;
	private int catCode;
	private int authCode;
	private String title;
	private String content;
	private int likeCount;
	private java.sql.Date time;
	private String soldYn;
	private int reportCount;
	private String blindYn;
	private int itemPrice;
	private int view;
	
	public PostDTO() {
	}

	public PostDTO(int code, int sellerCode, int buyerCode, int catCode, int authCode, String title, String content,
			int likeCount, Date time, String soldYn, int reportCount, String blindYn, int itemPrice, int view) {
		this.code = code;
		this.sellerCode = sellerCode;
		this.buyerCode = buyerCode;
		this.catCode = catCode;
		this.authCode = authCode;
		this.title = title;
		this.content = content;
		this.likeCount = likeCount;
		this.time = time;
		this.soldYn = soldYn;
		this.reportCount = reportCount;
		this.blindYn = blindYn;
		this.itemPrice = itemPrice;
		this.view = view;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(int sellerCode) {
		this.sellerCode = sellerCode;
	}

	public int getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(int buyerCode) {
		this.buyerCode = buyerCode;
	}

	public int getCatCode() {
		return catCode;
	}

	public void setCatCode(int catCode) {
		this.catCode = catCode;
	}

	public int getAuthCode() {
		return authCode;
	}

	public void setAuthCode(int authCode) {
		this.authCode = authCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public java.sql.Date getTime() {
		return time;
	}

	public void setTime(java.sql.Date time) {
		this.time = time;
	}

	public String getSoldYn() {
		return soldYn;
	}

	public void setSoldYn(String soldYn) {
		this.soldYn = soldYn;
	}

	public int getReportCount() {
		return reportCount;
	}

	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}

	public String getBlindYn() {
		return blindYn;
	}

	public void setBlindYn(String blindYn) {
		this.blindYn = blindYn;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	@Override
	public String toString() {
		return "PostDTO [code=" + code + ", sellerCode=" + sellerCode + ", buyerCode=" + buyerCode + ", catCode="
				+ catCode + ", authCode=" + authCode + ", title=" + title + ", content=" + content + ", likeCount="
				+ likeCount + ", time=" + time + ", soldYn=" + soldYn + ", reportCount=" + reportCount + ", blindYn="
				+ blindYn + ", itemPrice=" + itemPrice + ", view=" + view + "]";
	}
	
}
