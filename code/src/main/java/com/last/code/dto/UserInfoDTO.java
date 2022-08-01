package com.last.code.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDTO {
	
	private int userInfo_user_fno;
	private String userInfo_lang;
	private String userInfo_pofol;
	private String userInfo_photo;
	private String userInfo_other;
	private String userInfo_phone;
}
