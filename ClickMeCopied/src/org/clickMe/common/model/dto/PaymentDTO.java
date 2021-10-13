package org.clickMe.common.model.dto;

import java.sql.Date;

public class PaymentDTO implements java.io.Serializable {

	private static final long serialVersionUID = -3667724811978898160L;

	private int code;
	private int postCode;
	private String method;
	private Date paymentTime;
	
	public PaymentDTO() {
	}

	public PaymentDTO(int code, int postCode, String method, Date paymentTime) {
		this.code = code;
		this.postCode = postCode;
		this.method = method;
		this.paymentTime = paymentTime;
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

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Date getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Date paymentTime) {
		this.paymentTime = paymentTime;
	}

	@Override
	public String toString() {
		return "PaymentDTO [code=" + code + ", postCode=" + postCode + ", method=" + method + ", paymentTime="
				+ paymentTime + "]";
	}
}