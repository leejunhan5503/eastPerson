package org.clickMe.common.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1620454983492575276L;
	
	private int code;
	private int entCode;
	private String id;
	private String psw;
	private String email;
	private String phone;
	private String name;
	private java.sql.Date date;
	private String gender;
	private String authority;
	private int deposit;
	private String profileOrigName;
	private String profileUuidName;
	private String profileImgPath;
	private java.sql.Date lastLogin;
	private java.sql.Date enrollDate;
	
	public UserDTO() {
		
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getEntCode() {
		return entCode;
	}

	public void setEntCode(int entCode) {
		this.entCode = entCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public String getProfileOrigName() {
		return profileOrigName;
	}

	public void setProfileOrigName(String profileOrigName) {
		this.profileOrigName = profileOrigName;
	}

	public String getProfileUuidName() {
		return profileUuidName;
	}

	public void setProfileUuidName(String profileUuidName) {
		this.profileUuidName = profileUuidName;
	}

	public String getProfileImgPath() {
		return profileImgPath;
	}

	public void setProfileImgPath(String profileImgPath) {
		this.profileImgPath = profileImgPath;
	}

	public java.sql.Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(java.sql.Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public java.sql.Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(java.sql.Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "UserDTO [code=" + code + ", entCode=" + entCode + ", id=" + id + ", psw=" + psw + ", email=" + email
				+ ", phone=" + phone + ", name=" + name + ", date=" + date + ", gender=" + gender + ", authority="
				+ authority + ", deposit=" + deposit + ", profileOrigName=" + profileOrigName + ", profileUuidName="
				+ profileUuidName + ", profileImgPath=" + profileImgPath + ", lastLogin=" + lastLogin + ", enrollDate="
				+ enrollDate + "]";
	}

	public UserDTO(int code, int entCode, String id, String psw, String email, String phone, String name, Date date,
			String gender, String authority, int deposit, String profileOrigName, String profileUuidName,
			String profileImgPath, Date lastLogin, Date enrollDate) {
		super();
		this.code = code;
		this.entCode = entCode;
		this.id = id;
		this.psw = psw;
		this.email = email;
		this.phone = phone;
		this.name = name;
		this.date = date;
		this.gender = gender;
		this.authority = authority;
		this.deposit = deposit;
		this.profileOrigName = profileOrigName;
		this.profileUuidName = profileUuidName;
		this.profileImgPath = profileImgPath;
		this.lastLogin = lastLogin;
		this.enrollDate = enrollDate;
	}
	
	
}
