package org.clickMe.Member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.clickMe.Member.model.service.MemService;
import org.clickMe.common.model.dto.UserDTO;

/* service로 정보를 전달한 컨트롤러 형성 */
	@WebServlet("/member/login")
	public class MemController extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String userId = request.getParameter("userId");
			String userPsw = request.getParameter("userPsw");
			
			System.out.println("userId : " + userId);
			System.out.println("userPsw : " + userPsw);
			
			UserDTO requestloginMember = new UserDTO();
			requestloginMember.setId(userId);
			requestloginMember.setPsw(userPsw);
			
			MemService memService = new MemService();
			
			UserDTO loginMember = memService.selectUserLogin(requestloginMember);
			System.out.println(loginMember);
			
			if(loginMember != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loginMember", loginMember);
				
				response.sendRedirect(request.getContextPath());
			} else {
				request.setAttribute("message", "로그인 실패!");
				request.getRequestDispatcher("/WEB-INF/views/common/failed.jsp").forward(request, response);
		}
		
		}
		public void selectUserLogin(UserDTO login) {
			
		}

		public void selectUserId(Object findLostId) {
			
		}
		public void selectUserLogout(Object logout) {
			
		}





		public void selectAllUser() {
			// TODO Auto-generated method stub
			
		}





			


}
