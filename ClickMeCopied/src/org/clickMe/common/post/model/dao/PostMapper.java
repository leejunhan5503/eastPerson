package org.clickMe.common.post.model.dao;

import java.util.List;

import org.clickMe.common.model.dto.PostDTO;

public interface PostMapper {

	List<PostDTO> selectAllPost();

}
