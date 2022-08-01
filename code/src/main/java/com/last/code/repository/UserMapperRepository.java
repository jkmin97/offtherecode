package com.last.code.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.last.code.dto.UserDTO;

@Mapper
public interface UserMapperRepository {
	
	@Select("SELECT * FROM TBL_USER")
	public List<UserDTO> selectAll();
	
	@Insert("insert into tbl_user (user_pno, user_email, user_pw, user_nick) values (seq_user.nextval, #{user_email}, #{user_pw}, #{user_nick})")
	public UserDTO save(UserDTO dto);
	
	@Select("select * from tbl_user where user_email = #{user_email}")
	public UserDTO getEmail(UserDTO dto);
	
	@Select("select * from tbl_user where user_email = #{user_email} and user_pw = #{user_pw}")
	public UserDTO getPw(UserDTO dto);
	
//	/*Security*/
//	@Select("select * from tbl_user u where u.user_email = #{user_email")
//	public UserDTO 
//	
//	/*OAuth*/
//	@Select("select * from tbl_user u where u.user_email = #{user_email}")
//	public UserDTO 
	
	@Update("update tbl_user set user_nick = #{user_nick} where user_pno = #{user_pno}")
	public int updateNick(UserDTO dto);
	
	@Update("update tbl_user set user_pw = #{user_pw} where user_pno = #{user_pno}")
	public int updatePw(UserDTO dto);
	
	@Delete("delete from tbl_user where user_pno = #{user_pno}")
	public int deleteEmail(UserDTO dto);
	
}
