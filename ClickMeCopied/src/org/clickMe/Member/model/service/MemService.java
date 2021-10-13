package org.clickMe.Member.model.service;

import static org.clickMe.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.Member.model.dao.MemMapper;
import org.clickMe.common.model.dto.UserDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/* service 부분에는 이상이 없음 */
	public class MemService {
		
	public List<UserDTO> selectAllUser() {
		SqlSession sqlSession = getSqlSession();
		
		MemMapper memMapper = sqlSession.getMapper(MemMapper.class);
		
		List<UserDTO> userList = memMapper.selectAllUser();
		
		sqlSession.close();
		
		return userList;
			
		}
	
	public UserDTO selectUserLogin(UserDTO requestloginMember) {
		SqlSession sqlSession = getSqlSession();
		UserDTO loginUser = null;
		
		String encPsw = MemMapper.selectEncryptedPwd(sqlSession, requestloginMember);
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		/* 로그인 요청한 원문 비밀번호화 저장되어있는 암호화된 비밀번호가 일치하는지 확인한다. */
		if(passwordEncoder.matches(requestloginMember.getPsw(), encPsw)) {
		
			/* 비밀번호가 일치하는 경우에만 회원 정보를 조회해온다. */
			loginUser = MemMapper.selectLoginUser(sqlSession, requestloginMember);
		}
		
		sqlSession.close();
		
		return loginUser;
	}
}
	

