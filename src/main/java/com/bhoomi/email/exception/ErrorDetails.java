package com.bhoomi.email.exception;

/**
 * Customized error details are provided to client   
 * 
 * @filename ErrorDetails.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */

public class ErrorDetails {
	private String date;
	private String details;
	private String message;
	
	public ErrorDetails (String date, String message, String details) {
		super();
		this.date = date;
		this.details = details;
		this.message = message;
	}
	public String getdate() {
		return date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
