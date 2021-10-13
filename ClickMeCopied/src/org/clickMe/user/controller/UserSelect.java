package org.clickMe.user.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.service.UserService;

@WebServlet("/userSelect")
public class UserSelect  extends HttpServlet {
	
	UserService  userService = new UserService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("셀렉트 두겟");
		List<UserDTO> userList = userService.selectAllUserList();
		System.out.println(userList);
	

		for(UserDTO us : userList) {
			System.out.println(us);
		}
		
		String page="";
		
		if (!userList.isEmpty()) {
			page = "/WEB-INF/views/user/userlist.jsp";
			System.out.println("조회성공");
			request.setAttribute("userList", userList);
			
		} else {
			page = "/WEB-INF/views/user/result.jsp";
			System.out.println("조회실패");
			request.setAttribute("message", "회원 조회 실패!");
		}
		
		request.getRequestDispatcher(page).forward(request, response);
	}
	
}
