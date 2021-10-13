package org.clickMe.Inquiry;

import java.util.Scanner;

import org.clickMe.Inquiry.model.service.InquiryService;

public class InquiryApplication {

	public static void main(String[] args) {
		InquiryService inquiryService = new InquiryService();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("========= 1대1 문의 단위테스트 =========");
			System.out.println("1. 다 조회해보기");
			System.out.println("2. 아직 답변이 안된 문의 조회하기");
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();
			
			switch(no) {
			case 1 : inquiryService.selectAllInquiry(); break;
			case 2 : inquiryService.selectAnsweredInquiry(); break;
			}
			
		} while(false);
	}
}