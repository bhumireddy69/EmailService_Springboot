package com.bhoomi.email.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Resource Not Found exception is thrown in case wrong request is made  
 * 
 * @filename ResourceNotFoundException.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
