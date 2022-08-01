package com.last.code.phone;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API PHP
 */
public class PhoneService {
	public static void certifiedPhoneNumber(String PhoneNumber, String cerNum) {
		String api_key = "NCSZLCMHTRINLTVR";
	    String api_secret = "LVYPZBUFO8GUGI2BQOA2YIJC5KTKODEJ";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01029778893");
	    params.put("from", "01029778893");
	    params.put("type", "SMS");
	    params.put("text", "Off the Recode 인증 번호는 " + "[" + cerNum + "]" + "입니다.");
	    params.put("app_version", "test app 1.2"); // application name and version
	    
	    try {
	    	JSONObject obj = (JSONObject) coolsms.send(params);
	    	System.out.println(obj.toString());
	    } catch (CoolsmsException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println(e.getCode());
	    }
	}
	
	}
