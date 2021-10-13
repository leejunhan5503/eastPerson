package org.clickMe.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.common.model.dto.UserDTO;
import org.clickMe.user.service.UserSignupService;

@WebServlet("/userSignup")
public class UserSignupServlet extends HttpServlet {
	UserSignupService userSignupService = new UserSignupService();

	/* 회원 가입 폼을 작성 후 post 요청을 할 경우 처리하는 역할 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phoneNum").replace("-", "");
		String name = request.getParameter("name");
		java.sql.Date bdate = java.sql.Date.valueOf(request.getParameter("bdate"));
		String gender = request.getParameter("gender");
		
		UserDTO signupUser = new UserDTO();
		signupUser.setId(id);
		signupUser.setPsw(pwd);
		signupUser.setEmail(email);
		signupUser.setPhone(phone);
		signupUser.setName(name);
		signupUser.setDate(bdate);
		signupUser.setGender(gender);
		
		System.out.println("memberController requestMember : " + signupUser);
		
//		if(userSignupService.userSignup(signupUser)) {
//			System.out.println("입력성공");
//		} else {
//			System.out.println("입력실패");
//		}
//		
//		System.out.println("memberController result : " + result);
//		
		String page = "";
		
		if(userSignupService.userSignup(signupUser)) {
			
			page = "/WEB-INF/views/user/result.jsp";
			System.out.println("입력성공");
			request.setAttribute("message", "등록 성공");
			request.setAttribute("signupUser", signupUser);
			
		} else {
			
			page = "/WEB-INF/views/user/result.jsp";
			System.out.println("입력실패");
			request.setAttribute("message", "회원 가입 실패!");
		}
		
		request.getRequestDispatcher(page).forward(request, response);

		
	}

}
