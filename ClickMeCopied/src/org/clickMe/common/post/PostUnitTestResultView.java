package org.clickMe.common.post;

import java.util.List;

import org.clickMe.common.model.dto.PostDTO;

public class PostUnitTestResultView {

	public void printPostList(List<PostDTO> postList) {
		for (PostDTO list : postList) {
			System.out.println(list);
		}
	}

	public void printErrorMessage(String errorCode) {
		String errorMessage = "";
		
		switch (errorCode) {
		case "selectList": errorMessage = "전체 게시글 목록 조회에 실패했습니다."; break;
		}
		
		System.out.println(errorMessage);
	}

}
