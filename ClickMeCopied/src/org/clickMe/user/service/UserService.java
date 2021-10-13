package org.clickMe.user.service;

import static org.clickMe.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.mapper.UserMapper;

/**   
	* @packageName : org.clickMe.member.service 
	* @Class : UserService
    * @Comment : UserService 작업에 관한 클래스
	* @fileName : UserService.java 
	* @author : Hansoo Lee
    * @History : 2021.10.08 Hansoo Lee 처음 작성함 
*/
public class UserService {

	public List<UserDTO> selectAllUserList() {
		
		SqlSession sqlSession = getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<UserDTO> userList = userMapper.selectAllUser();
		System.out.println(userList);
		// 매퍼 인터페이스 활용 remix
		sqlSession.close();
		
		return userList;
	}

	public boolean insertUser(UserDTO user) {
		
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

	public String findUserId(String name, String email) {
		
		SqlSession sqlSession = getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		String id = userMapper.findUserId();
		return id;
	}

	public UserDTO selectUser(int code) {
		
		SqlSession sqlSession = getSqlSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserDTO user1 = userMapper.selectUser(code);
		
		
		sqlSession.close();
		
		return user1;
	}
		
	public boolean modifyUserInfor(UserDTO user) {
		
		SqlSession sqlSession = getSqlSession();
		
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		int result = userMapper.modifyUserInfor(user);
		System.out.println("입력ser");
		
		if (result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0 ? true : false;
	}

}
