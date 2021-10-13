package org.clickMe.Inquiry.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.clickMe.Inquiry.model.service.InquiryService;
import org.clickMe.common.model.dto.InquiryDTO;

@WebServlet("/inquiry/list")
public class SelectAllInquiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1036083370842128523L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InquiryService inqService = new InquiryService();
		List<InquiryDTO> inqList = inqService.selectAllInquiry();
		
		String path = "";
		if (inqList != null) {
			path = "/WEB-INF/views/inquiry/allInquiry.jsp";
			request.setAttribute("inqList", inqList);
		} else {
			System.out.println("기능동작안함");
		}
		
		request.getRequestDispatcher(path).forward(request, response);
	}

}
