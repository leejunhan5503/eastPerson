package org.clickMe.Inquiry.model.dao;

import java.util.List;

import org.clickMe.common.model.dto.InquiryDTO;

public interface InquiryMapper {

	List<InquiryDTO> selectAllInquiry();
	
	List<InquiryDTO> selectAnsweredInquiry();

	int insertInquiry(InquiryDTO newInquiry);
}
