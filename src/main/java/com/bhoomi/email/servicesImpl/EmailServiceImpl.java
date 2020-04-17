package com.bhoomi.email.servicesImpl;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.bhoomi.email.services.EmailService;
import com.google.gson.Gson;
/**
 * EmailService implementation 
 * 
 * @filename EmailServiceImpl.java
 *
 * @author Chaitanya Bhoomireddy
 * 
 */
@Service
public class EmailServiceImpl implements EmailService{
	private final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
	
	@Autowired
	Gson gson;
	
	@Autowired
    JavaMailSender emailSender;
	
	@Value("${form.loc}")
	private String formLoc;
 
    
    
    public boolean sendEmail(String emailId, String formName) {
    	try{MimeMessage message = emailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(message, true);
    	helper.setTo("demo@demo.com");
    	helper.setFrom("demo@demo.com");
	    helper.setSubject(formName);
	    helper.setText("from");
    	FileSystemResource file = new FileSystemResource(new File(formLoc+"/"+formName));
    	helper.addAttachment(file.getFilename(), file);
    	emailSender.send(message);
    	logger.info(formLoc);
    	return true;
    	}catch (Exception e) {e.printStackTrace(); return false;}
    }
	
}
