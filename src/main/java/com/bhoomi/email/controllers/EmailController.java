package com.bhoomi.email.controllers;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhoomi.email.services.EmailService;
/**
 * All the controllers related to Email Service 
 * 
 * @filename EmailController.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@RestController
@RequestMapping("/sendEmail")
public class EmailController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmailService eService;
	
	@GetMapping("/{mailId}/{formName}")
	public boolean sendEmail(@PathVariable String mailId, @PathVariable String formName)  
	{	
		logger.info("Sending Email");
		boolean isSuccess = eService.sendEmail(mailId, formName);
		return isSuccess;
	}

}