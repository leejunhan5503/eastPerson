package org.clickMe.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.clickMe.common.model.dto.UserDTO;

public class Application {
	UserController userController = new UserController();
	public static void main(String[] args) {

		UserController userController = new UserController();

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("========= 유저조회 단위테스트 =========");
			System.out.println("1. 다 조회해보기");
			System.out.println("2. 회원입력");
			System.out.println("3. 회원정보 수정, 블랙리스트 등록, 회원삭제 (안보이게)");
			System.out.println("4. 아이디 찾기");
			System.out.println("5. 코드로 회원정보 조회");
			System.out.println("6. 비밀번호 초기화 (마지막에)");
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				userController.selectAllUserList();
				break;

			case 2:
				userController.insertUser(signup());
				break;

			case 3:
				modifyUser();
				break;

//			case 4:
//				userController.findUserId(findId());
//				break;
				
				case 5:
				userController.codeSelectUser(codeSelect());
				break;

			}
		} while (true);
	}



	private static UserDTO signup() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디");
		String id = sc.nextLine();
		System.out.print("비번");
		String pwd = sc.nextLine();
		System.out.print("이멜");
		String email = sc.nextLine();
		System.out.print("폰번");
		String phone = sc.nextLine();
		System.out.print("이름");
		String name = sc.nextLine();
		java.sql.Date bdate = java.sql.Date.valueOf("2002-06-22");
		System.out.print("남여 : ");
		String gender = sc.nextLine();

		UserDTO signupUser = new UserDTO();
		signupUser.setId(id);
		signupUser.setPsw(pwd);
		signupUser.setEmail(email);
		signupUser.setPhone(phone);
		signupUser.setName(name);
		signupUser.setDate(bdate);
		signupUser.setGender(gender);

		System.out.println("memberController requestMember : " + signupUser);

		return signupUser;
	}

	private static void modifyUser() {
		UserController userController = new UserController();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("========= 회원정보 수정 단위테스트 =========");
			System.out.println("1. 코드로 회원정보 수정");
			System.out.println("2. 코드로 블랙리스트 등록");
			System.out.println("3. 코드로 탈퇴 or 휴면상태로 등록");
			System.out.println("9. 이전메뉴로");
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();

			switch (no) {
			case 1:
				modifyUserinfor(userController.codeSelectUser(codeSelect()));
				break;

			case 2:
				registBlackUser(userController.codeSelectUser(codeSelect()));
				break;

			case 3:
				registDeactivateUser();
				break;

			case 9 : return;
			
			default : System.out.println("번호를 잘못 입력하셨습니다.");
			}
		} while (false);
	

	}




	private static void modifyUserinfor(UserDTO codeSelectUser) {
		UserController userController = new UserController();
		Scanner sc = new Scanner(System.in);
		
		UserDTO user = codeSelectUser;
		
		System.out.println(user);
		
		do {
			System.out.println("========= 코드 선택후 회원정보 수정 단위테스트 =========");
			System.out.println("1. 정보 다시 조회");
			System.out.println("2. 이메일 수정");
			System.out.println("3. 핸드폰번호 수정");
			System.out.println("4. 이름 수정");
//			System.out.println("5. 생년월일 수정");
			System.out.println("6. 성별 수정");
			System.out.println("7. 예치금 수정");
			System.out.println("8. 수정 사항 적용");
			System.out.println("9. 이전메뉴로");
			System.out.print("메뉴를 선택하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();
			switch (no) {
			case 1:
				System.out.println(user);
				break;

			case 2:
				System.out.print("수정할 이메일 입력");
				String email = sc.nextLine();
				user.setEmail(email);
				break;

			case 3:
				System.out.print("수정할 핸드폰번호 입력");
				String phone = sc.nextLine();
				user.setPhone(phone);
				break;
				
			case 4:
				System.out.print("수정할 이름 입력");
				String name = sc.nextLine();
				user.setName(name);
				break;
				
//			case 5:
//				System.out.print("수정할 생년월일 입력");
//				String email = sc.nextLine();
//				break;
				
			case 6:
				System.out.print("수정할 성별 입력 (M or F)");
				String gender = sc.nextLine();
				user.setGender(gender);
				break;
				
			case 7:
				System.out.print("수정할 예치금 입력 (숫자만)");
				int deposit = sc.nextInt();
				user.setDeposit(deposit);
				break;
				
			case 8:
				userController.modifyUserInfor(user);
				return;

			case 9 : return;
			
			default : System.out.println("번호를 잘못 입력하셨습니다.");
			}
		} while (true);
	}






	private static void registDeactivateUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("코드를 입력하세요 : ");
		String code = sc.nextLine();
	}



	private static void registBlackUser(UserDTO codeSelectUser) {
		
	}





	private static Map<String, String> modifyUsers() {

		Scanner sc = new Scanner(System.in);
		System.out.print("코드를 입력하세요 : ");
		String code = sc.nextLine();
		
		Map<String, String> userCode = new HashMap<>();
		userCode.put("code", code);
		
		
		return userCode;
	}
	
	
	
	
	
	private static Map<String, String> codeSelect() {
		Scanner sc = new Scanner(System.in);
		System.out.print("코드를 입력하세요 : ");
		String code = sc.nextLine();
		
		Map<String, String> userCode = new HashMap<>();
		userCode.put("code", code);
		
		
		return userCode;
	}
	
	
	
	private static Map<String, String> findId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름");
		String name = sc.nextLine();
		System.out.print("이메일");
		String email = sc.nextLine();
		
		Map<String, String> userParam = new HashMap<>();
		
		userParam.put("name", name);
		userParam.put("email", email);
		
		return userParam;
	}
}
