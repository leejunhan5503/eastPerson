package org.clickMe.Member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.common.model.dto.UserDTO;

/* DAO 역할을 하는 LoginMapper 생성 */
	public interface MemMapper {

		List<UserDTO> selectAllUser();

		int selectUserLogin(UserDTO user);
	
		/* 로그인 */
		public static String selectEncryptedPwd(SqlSession session, UserDTO requestMember) {
			
			return session.selectOne("MemberDAO.selectEncryptedPwd", requestMember);
		}

		/* 패스워드 일치 시 회원 정보 조회용 메소드 */
		public static UserDTO selectLoginUser(SqlSession session, UserDTO requestMember) {
			
			return session.selectOne("MemberDAO.selectLoginMember", requestMember);
		}
		
}