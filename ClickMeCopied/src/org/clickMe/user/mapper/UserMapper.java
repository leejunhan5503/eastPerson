package org.clickMe.user.mapper;

import java.util.List;

import org.clickMe.common.model.dto.UserDTO;

public interface UserMapper {
	
	List<UserDTO> selectAllUser();

	UserDTO selectUser(int code);
	
	int insertUser(UserDTO user);

	String findUserId();

	int modifyUserInfor(UserDTO user);


}
