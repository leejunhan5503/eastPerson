package org.clickMe.user.service;

import static org.clickMe.common.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.mapper.UserMapper;


public class UserSignupService{
	
	public boolean userSignup(UserDTO user) {
		
		
		SqlSession sqlSession = getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		int result = userMapper.insertUser(user);
		
		
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
		
	}
	

}
