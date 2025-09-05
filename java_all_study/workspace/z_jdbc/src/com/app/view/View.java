package com.app.view;

import java.util.Optional;

import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.ReplyVO;
import com.app.domain.dto.ReplyDTO;
import com.app.repogitory.MemberDAO;
import com.app.repogitory.PostDAO;
import com.app.repogitory.ReplyDAO;

public class View {
	public static void main(String[] args) {
		// ========== member 추가 ========== //
//		MemberVO memberVO = new MemberVO();
//		MemberDAO memberDAO = new MemberDAO();
//	
//		memberVO.setMemberEmail("test3@gmail.com");
//		memberVO.setMemberPassword("123");
//		memberVO.setMemberName("테스트3");
//		memberVO.setMemberAge(30);
//		memberVO.setMemberGender("남");
//				
//		memberDAO.insert(memberVO);	
//		System.out.println(memberVO);
		
		// ========== post 추가 ========== //
//		PostVO postVO = new PostVO();
//		PostDAO postDAO = new PostDAO();
//		
//		postVO.setPostTitle("테스트 제목2");
//		postVO.setPostContent("테스트 내용2");
//		postVO.setMemberId(2L);
//		
//		postDAO.insert(postVO);
//		System.out.println(postVO);
		
		// ========== reply 추가 ========== //
//		ReplyVO replyVO = new ReplyVO();
//		ReplyDAO replyDAO = new ReplyDAO();
//		
//		replyVO.setReplyContent("테스트 댓글2-2");
//		replyVO.setMemberId(2L);
//		replyVO.setPostId(2L);
//		
//		replyDAO.insert(replyVO);
//		System.out.println(replyVO);
		
		// ========== Hard - delete ========== //
//		ReplyDAO replyDAO = new ReplyDAO();
//		
//		replyDAO.deleteHard(1L);
//		System.out.println("Hard - delete 완료");
		
		// ========== Soft - delete ========== //
//		ReplyDAO replyDAO = new ReplyDAO();		
//		replyDAO.deleteSoft(3L);
//		System.out.println("Soft-delete 완료");
		
//		PostDAO postDAO = new PostDAO();
//		postDAO.deleteSoft(1L);
//		System.out.println("Soft-delete 완료");
		
		// ========== 조회 ========== //
		ReplyDAO replyDAO = new ReplyDAO();
		ReplyDTO replyDTO = replyDAO.selectOne(4L);
		System.out.println(replyDTO);
		
//		MemberDAO memberDAO = new MemberDAO();
//		Optional<MemberVO> memberVO = memberDAO.selectOne(1L);
//		System.out.println(memberVO);
			
		// ========== 전체 조회	 ========== //
//		PostDAO postDAO = new PostDAO();
//		postDAO.selectAll().forEach(System.out::println);
		
//		MemberDAO memberDAO = new MemberDAO();
//		memberDAO.selectAll().forEach(System.out::println);
		
//		ReplyDAO replyDAO = new ReplyDAO();
//		replyDAO.selectAll().forEach(System.out::println);
		
		
		
		
	}
}
