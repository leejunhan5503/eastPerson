package org.clickMe.common.post.controller;

import java.util.List;

import org.clickMe.common.model.dto.PostDTO;
import org.clickMe.common.post.PostUnitTestResultView;
import org.clickMe.common.post.model.service.PostService;

public class PostController {
	private final PostService postService;
	private final PostUnitTestResultView resultView;

	public PostController() {
		this.postService = new PostService();
		this.resultView = new PostUnitTestResultView();
	}

	public void selectAllPost() {
		List<PostDTO> postList = postService.selectAllPost();
		
		if (!postList.isEmpty()) {
			resultView.printPostList(postList);
		} else {
			resultView.printErrorMessage("selectList");
		}
	}

}
