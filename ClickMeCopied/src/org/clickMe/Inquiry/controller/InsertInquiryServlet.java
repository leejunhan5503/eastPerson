package org.clickMe.Inquiry.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.Inquiry.model.service.InquiryService;
import org.clickMe.common.model.dto.InquiryDTO;

@WebServlet("/inquiry/insert")
public class InsertInquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("inqTitle");
		String content = request.getParameter("inqContent");
		
		InquiryDTO inquiry = new InquiryDTO();
		inquiry.setInqTitle(title);
		inquiry.setInqContent(content);

		InquiryService inquiryService = new InquiryService();
		int result = inquiryService.insertInquiry(inquiry);
		
		String path = "";
		if(result > 0) {
			path = "/WEB-INF/views/user/result.jsp";
			System.out.println("입력성공");
			request.setAttribute("message", "등록 성공");
			request.setAttribute("signupUser", "1:1문의 등록 성공했어요!");
		} else {
			System.out.println("기능동작안함");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}
}
