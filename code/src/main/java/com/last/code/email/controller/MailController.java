//package com.last.code.email.controller;
//
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.last.code.email.util.EmailUtil;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//@RequiredArgsConstructor
//@RestController
//public class MailController {
//	
//	private final EmailUtil emailUtil;
//	
//	
//	@PostMapping("/email")
//	public Map<String, Object> sendEmail(@RequestBody Map<String, Object> params) {
//		log.info("email params={}", params);
//		
//		return emailUtil.sendEmail((String)params.get("userId")
//				, (String) params.get("subject")
//				, (String) params.get("body")
//				);
//	}
//}
