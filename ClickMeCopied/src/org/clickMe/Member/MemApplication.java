package org.clickMe.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.clickMe.Member.controller.MemController;
import org.clickMe.common.model.dto.UserDTO;

	/* 실행 역할을 하는 어플리케이션 클래스 생성 */
	public class MemApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemController memController = new MemController();
		
		do {
			System.out.println("=====로그인 세션 관리 =====");
			System.out.println("0. 모든 회원 조회");
			System.out.println("1. 로그인하기");
			System.out.println("2. 로그아웃 하기");
			System.out.println("3. 아이디 찾기");
			System.out.println("4. 비밀번호 초기화");
			System.out.print(" 고객님이 이용할 기능을 번호로 입력하세요. ");
			
			int no = sc.nextInt();
			
			switch(no) {
				case 0 : memController.selectAllUser();break;
				case 1 : memController.selectUserLogin(login()); break;
				case 2 : memController.selectUserLogout(logout());break;
				case 3 : memController.selectUserId(findLostId());break;
				default : System.out.println("선택지를 다시 한번 확인해주세요.");
			}
			
		} while(false);
		
	}
	private static UserDTO login() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요.");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요. ");
		String psw = sc.nextLine();
		
		UserDTO loginUser = new UserDTO();
		loginUser.setId(id);
		loginUser.setPsw(psw);
		
		
		return loginUser;
	}
	private static Object search() {
		return null;
	}
	private static Object logout() {
		return null;
	}
	private static Object findLostId() {
		return null;
	}
}
