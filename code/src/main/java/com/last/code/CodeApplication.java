package com.last.code;



import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CodeApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(CodeApplication.class, args);
    }

}


