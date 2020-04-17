package com.bhoomi.email.services;

/**
 * EmailService mapped for EmailController 
 * 
 * @filename EmailService.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
public interface EmailService {
	public abstract boolean sendEmail(String mailId, String formName);
}
