package org.clickMe.common.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class NoticeDTO implements Serializable {
	private static final long serialVersionUID = -5173835599604023480L;
	
	private int code;
	private String title;
	private String content;
	private Date time;
	
	public NoticeDTO() {
	}

	public NoticeDTO(int code, String title, String content, Date time) {
		this.code = code;
		this.title = title;
		this.content = content;
		this.time = time;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "NoticeDTO [code=" + code
				+ ", title=" + title
				+ ", content=" + content
				+ ", time=" + time + "]";
	}
	
}
