package com.last.code;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.last.code.email.service.EmailSenderService;

import lombok.extern.slf4j.Slf4j;

@EnableJpaAuditing
@SpringBootApplication
@Slf4j
public class CodeApplication {

	@Autowired
	private EmailSenderService senderService;
	
    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class, args);
    }
    
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
    	Random random = new Random();
		int checkNum = random.nextInt(888888) + 111111;
		log.info("인증번호" + checkNum);
    	senderService.sendEmail("chupachicchok@naver.com",
    			"OffTheRecode 인증 메일입니다.", "인증번호는 " + checkNum + "입니다");
    }

}


