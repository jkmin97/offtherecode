package com.last.code.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.last.code.dto.UserInfoDTO;

@Mapper
public interface UserInfoMapperRepository {
	
	@Select("SELECT * FROM TBL_USERINFO")
	public List<UserInfoDTO> selectAll();
	
	@Insert("INSERT INTO TBL_USERINFO (USERINFO_LANG, USERINFO_POFOL, USERINFO_PHOTO, USERINFO_OTHER, USERINFO_PHONE) VALUES(#{USERINFO_LANG}, #{USERINFO_POFOL}, #{USERINFO_PHOTO}, #{USERINFO_OTHER}, #{USERINFO_PHONE}")
	public UserInfoDTO save(UserInfoDTO infoDTO);
	
	@Select("SELECT * FROM TBL_USERINFO WHERE USERINFO_LANG = #{USERINFO_LANG}")
	public UserInfoDTO getLang(UserInfoDTO infoDTO);
	
	@Select("SELECT * FROM TBL_USERINFO WHERE USERINFO_POFOL = #{USERINFO_POFOL}")
	public UserInfoDTO getPofol(UserInfoDTO infoDTO);
	
	@Select("SELECT * FROM TBL_USERINFO WHERE USERINFO_PHOTO = #{USERINFO_PHOTO}")
	public UserInfoDTO getPhoto(UserInfoDTO infoDTO);
	
	@Select("SELECT * FROM TBL_USERINFO WHERE USERINFO_OTHER = #{USERINFO_OTHER}")
	public UserInfoDTO getOther(UserInfoDTO infoDTO);
	
	@Select("SELECT * FROM TBL_USERINFO WHERE USERINFO_PHONE = #{USERINFO_PHONE}")
	public UserInfoDTO getPhone(UserInfoDTO infoDTO);
	
	@Update("UPDATE TBL_USERINFO SET USERINFO_LANG = #{USERINFO_LANG} WHERE USERINFO_USER_FNO = #{USERINFO_USER_FNO}")
	public int updateLang(UserInfoDTO infoDTO);
	
	@Update("UPDATE TBL_USERINFO SET USERINFO_POFOL = #{USERINFO_POFOL} WHERE USERiNFO_USER_FNO = #{USERINFO_USER_FNO}")
	public int updatePofol(UserInfoDTO infoDTO);
	
	@Update("UPDATE TBL_USERINFO SET USERINFO_PHOTO = #{USERINFO_PHOTO} WHERE USERINFO_USER_FNO = #{USERINFO_USER_FNO}")
	public int updatePhote(UserInfoDTO infoDTO);
	
	@Update("UPDATE TBL_USERINFO SET USERINFO_OTHER = #{USERINFO_OTHER} WHERE USERINFO_USER_FNO = #{USERINFO_USER_FNO}")
	public int updateOther(UserInfoDTO infoDTO);
	
	@Update("UPDATE TBL_USERINFO SET USERINFO_PHONE = #{USERINFO_PHONE} WHERE USERINFO_USER_FNO = #{USERINFO_USER_FNO}")
	public int updatePhone(UserInfoDTO infoDTO);
	
	
} 
