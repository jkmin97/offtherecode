package com.last.code.phone;

import java.util.Random;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;

@RestController
public class PhoneController {
	
	@GetMapping("/test")
	public String test1() {
		return "test";
	}
	
	@PostMapping("/message")
	public @ResponseBody String testMessage(String phoneNumber) {
		Random rand = new Random();
		String numStr = "";
		for (int i = 0; i < 4; i++) {
			String ran = Integer.toString(rand.nextInt(10));
			numStr += ran;
		}
		
		PhoneService.certifiedPhoneNumber(phoneNumber, numStr);
		
		return "ok";
	}
//	@Resource
//	private PhoneService phoneService;
//	
//	Random random = new Random();
//	int randomNo = 0;
//	String randomStr = "";
//	
//	@GetMapping("/sendMessage")
//	public void sendMessage(@RequestParam("check_message") String number) {
//		log.info(number);
//		if(randomNo == 0) {
//			randomNo = random.nextInt(8888) + 1111;
//			phoneService.singleSms(number, "Off the Recode 휴대폰 인증번호는 " + "[9945]" + "입니다.");
//			log.info(randomNo + "");
//		}
//	}
	
//	@GetMapping("/checkRight")
//	boolean checkMessage(@RequestParam("check_message") String checkMessage) {
//		boolean check = false;
//		
//		if(randomNo == Integer.parseInt(checkMessage)) {
//			check = true;
//			randomNo = 0;
//		}
//		
//		return check;
//	}
	
	

	
	
}
