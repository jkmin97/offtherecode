package com.last.code.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.last.code.service.EmailSenderService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("mail")
public class MailController {
	
	Random random = new Random();
	int randomNo = 0;
	String randomStr = "";
	
	@Autowired
	private EmailSenderService senderService;
	
	 @GetMapping("/sendMail")
	 void sendMail(@RequestParam("check_email") String email) {
		 log.info(email);
		 if(randomNo==0) {
			 randomNo = random.nextInt(888888) + 111111;
			 senderService.sendEmail(email, "Off the Recode 인증 메일", "인증번호는 " + randomNo + " 입니다.");
			 log.info(randomNo + "");
		 }
	 }
	
	@GetMapping("/checkNo")
	boolean checkMail(@RequestParam("check_no") String checkNo) {
		boolean check = false;
		
		if(randomNo == Integer.parseInt(checkNo)) {
			check = true;
			randomNo = 0;
		}
		
		return check;
	}	 
}
