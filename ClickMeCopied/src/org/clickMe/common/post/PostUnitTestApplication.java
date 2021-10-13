package org.clickMe.common.post;

import java.util.Scanner;

import org.clickMe.common.post.controller.PostController;

public class PostUnitTestApplication {
	
	public static void main(String[] args) {
		PostController postController = new PostController();
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("========== 게시글 단위 테스트 ==========");
			System.out.println("1. 게시글 전체 조회");
			System.out.println("2. 게시글 검색 조회");
			System.out.println("9. 게시글 단위 테스트 종료");
			System.out.print("Enter the Unit Test number you want : ");
			
			int num = sc.nextInt();
			
			switch (num) {
			case 1: postController.selectAllPost(); break;
			case 2: break;
			case 9: System.out.println("게시글 단위 테스트 종료."); return;
			default: System.out.println("올바르지 않은 번호를 입력하였습니다! : " + num);
			}
		} while (true);
		
	}
}
