/**
 * 
 */
package org.clickMe.user.controller;

import java.util.List;
import java.util.Map;

import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.service.UserService;

/**   
	* @packageName : org.clickMe.member.controller 
	* @Class : UserController
    * @Comment : UserController
	* @fileName : UserController.java 
	* @author : Hansoo Lee
    * @History : 2021.10.08 Hansoo Lee 처음 작성함 
    * @see 참고할 class나 외부 url
*/


public class UserController {
	UserService userService = new UserService();

	public void selectAllUserList() {
		
		List<UserDTO> userList = userService.selectAllUserList();
		
		if (!userList.isEmpty()) {
			for (UserDTO user : userList) {
				System.out.println(user);
			}
		} else {
			System.out.println("못불러옴");
		}
	}


	public void insertUser(UserDTO signup) {
		
		System.out.println(signup);	
		
		if (userService.insertUser(signup)) {
			System.out.println("입력성공");
		} else {
			System.out.println("입력실패");
		}
	}


	public UserDTO codeSelectUser(Map<String, String> codeSelect) {

		int code = Integer.parseInt(codeSelect.get("code"));
		
		UserDTO user1= userService.selectUser(code);
		
		if (user1 != null) {
				System.out.println("불러옴");
				System.out.println(user1);
			
		} else {
			System.out.println("못불러옴");
		}
		
		return user1;
		
	}

	public void modifyUserInfor(UserDTO user) {
		
		System.out.println(user);
		
		if (userService.modifyUserInfor(user)) {
			System.out.println("입력성공");
		} else {
			System.out.println("입력실패");
		}

	}
		
		
	


	
	
	
	
	
	
	
	
	
	
//	public void findUserId(Map<String, String> userParam) {
//		
//		String name = userParam.get("name");
//		String email = userParam.get("email");
//		
//		String id = userService.findUserId(name, email);
//		UserDTO user = new UserDTO();
//		user.setCode(code);
//		user.setName(name);
//		
//		if (menuService.modifyMenu(menu)) {
//			printResult.printSuccessMessage("update");
//		} else {
//			printResult.printErrorMessage("update");
//		}
//		
//		
//		
//	}
	
	
	
	
}
