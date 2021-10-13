package org.clickMe.Inquiry.model.service;

import static org.clickMe.common.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.clickMe.Inquiry.model.dao.InquiryMapper;
import org.clickMe.common.model.dto.InquiryDTO;

public class InquiryService {

	private InquiryMapper mapper;
	
	public List<InquiryDTO> selectAllInquiry() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(InquiryMapper.class);
		
		List<InquiryDTO> inquiryList = mapper.selectAllInquiry();
		
		if (!inquiryList.isEmpty()) {
			for (InquiryDTO inquiry : inquiryList) {
				System.out.println(inquiry);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
		sqlSession.close();
		
		return inquiryList;
	}

	public List<InquiryDTO> selectAnsweredInquiry() {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(InquiryMapper.class);
		
		List<InquiryDTO> inquiryList = mapper.selectAnsweredInquiry();
		
		if (!inquiryList.isEmpty()) {
			for (InquiryDTO inquiry : inquiryList) {
				System.out.println(inquiry);
			}
		} else {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
		sqlSession.close();
		
		return inquiryList;
	}	
	
	public int insertInquiry(InquiryDTO newInquiry) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(InquiryMapper.class);
		
		int result = mapper.insertInquiry(newInquiry);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}
}


