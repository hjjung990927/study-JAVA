package com.app.view;

import java.util.ArrayList;

import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.ReplyVO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.member.MemberGender;
import com.app.repogitory.MemberDAO;
import com.app.repogitory.PostDAO;
import com.app.repogitory.ReplyDAO;

public class View {
	public static void main(String[] args) {
//--- member 테이블에 member 추가 ---
//		MemberVO memberVO = new MemberVO();
//		MemberDAO memberDAO = new MemberDAO();
//		
//		memberVO.setMemberEmail("test5@gmail.com");
//		memberVO.setMemberPassword("5");
//		memberVO.setMemberName("테스트5");
//		memberVO.setMemberAge(50);
//		memberVO.setMemberGender(MemberGender.NONE);
//		
//		memberDAO.insert(memberVO);
//		System.out.println("추가 완료");

//--- member 테이블에 member 한명 조회 ---
//		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = memberDAO.selectOne(1L);
//		System.out.println(memberVO);

//--- member 테이블에 member 전체 조회 ---
//		MemberDAO memberDAO = new MemberDAO();
//		memberDAO.selectAll().forEach(System.out::println);

//--- post 테이블에 post 추가 ---
//		PostVO postVO = new PostVO();
//		PostDAO postDAO = new PostDAO();
//		
//		postVO.setPostTitle("테스트 제목5-1");
//		postVO.setPostContent("테스트 내용5-1");
//		postVO.setId(5L);
//		
//		postDAO.insert(postVO);
//		System.out.println("추가 완료");		

//--- post 테이블에 Hard-delete 삭제 ---
//		PostDAO postDAO = new PostDAO();		
//		postDAO.deleteHard(2L);
//		System.out.println("Hard-delete 완료");

//--- post 테이블에 Soft-delete 삭제 ---
//		PostDAO postDAO = new PostDAO();
//		postDAO.deleteSoft(5L);
//		System.out.println("Soft-delete 완료");

//--- post 테이블에 post 한개 조회 ---
//		PostDAO postDAO = new PostDAO();
//		PostDTO postDTO = postDAO.selectOne(1L);
//		System.out.println(postDTO);

//--- post 테이블에 post 수정 ---
//		PostDAO postDAO = new PostDAO();
//		PostDTO postDTO = postDAO.selectOne(1L);
//		postDTO.setPostContent("수정된 내용1-1");
//		postDAO.update(postDTO.toVO());
//		System.out.println("수정 완료");

//--- post 테이블에 post 전체 조회 ---
//		PostDAO postDAO = new PostDAO();
//		postDAO.selectAll().forEach(System.out::println);

//--- reply 테이블에 reply 추가 ---
//		ReplyVO replyVO = new ReplyVO();
//		ReplyDAO replyDAO = new ReplyDAO();
//		replyVO.setReplyContent("테스트 댓글5-1");
//		replyVO.setMemberId(2L);
//		replyVO.setPostId(1L);
//		replyDAO.insert(replyVO);
//		System.out.println("추가 완료");

//--- reply 테이블에 reply 전체 수정 ---
//		ReplyDAO replyDAO = new ReplyDAO();
//		replyDAO.selectAll().stream().map(ReplyDTO::toVO).forEach((reply) -> {
//			reply.setReplyContent("수정된 댓글1-1");
//			replyDAO.update(reply);
//		});
//		System.out.println("수정 완료");

//--- reply 테이블에 reply 전체 조회 ---
//		ReplyDAO replyDAO = new ReplyDAO();
//		replyDAO.selectAll().forEach(System.out::println);

//--- 선택한 post 안에 달린 모든 댓글 조회 ---
//		ReplyDAO replyDAO = new ReplyDAO();
//		ArrayList<ReplyDTO> replyDTOs = replyDAO.selectAll();
//		Long postId = 3L;
//
//		replyDTOs.stream().filter(reply -> reply.getPostId().equals(postId)).forEach(reply -> System.out.println(reply.getReplyContent()));

//--- 선택한 회원 한명이 쓴 모든 댓글 조회 ---
//		ReplyDAO replyDAO = new ReplyDAO();
//		ArrayList<ReplyDTO> replyDTOs = replyDAO.selectAll();
//		Long memberId = 1L;
//		
//		replyDTOs.stream().filter(reply -> reply.getMemberId().equals(memberId)).forEach(reply -> System.out.println(reply.getReplyContent()));
		
//--- 댓글 단 사람의 이름에 1이 포함된 사람만 정보 출력 ---
//		ReplyDAO replyDAO = new ReplyDAO();
//		ArrayList<ReplyDTO> replyDTOs = replyDAO.selectAll();
//		
//		replyDTOs.stream().filter(reply -> reply.getMemberName().contains("1")).forEach(System.out::println);
		
		
	}
}
