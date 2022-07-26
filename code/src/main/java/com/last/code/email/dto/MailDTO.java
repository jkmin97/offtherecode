package com.last.code.email.dto;

import java.util.ArrayList;
import java.util.List;

public class MailDTO {
	private String fromAddress;
	private List<String> toAddressList;
	private String title;
	private String content;
	
	public MailDTO() {
		super();
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public List<String> getToAddressList() {
		return toAddressList;
	}

	public void setToAddressList(List<String> toAddressList) {
		this.toAddressList = toAddressList;
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
	
	public void initToAddressList() {
		this.toAddressList = new ArrayList<String>();
	}
	
	public void addToAddress(String toAddress) {
		if(this.toAddressList == null) {
			this.toAddressList = new ArrayList<String>();
		}
		this.toAddressList.add(toAddress);
	}
}
