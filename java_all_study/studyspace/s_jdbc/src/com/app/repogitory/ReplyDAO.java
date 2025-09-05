package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.ReplyVO;
import com.app.domain.dto.ReplyDTO;

public class ReplyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가
	public void insert(ReplyVO replyVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_reply");
		stringBuilder.append("(reply_content, post_id, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getPostId());
			preparedStatement.setLong(3, replyVO.getMemberId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert(ReplyVO) SQL 오류");
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	수정
	public void update(ReplyVO replyVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_reply ");
		stringBuilder.append("set reply_content = ?, updated_date = current_timestamp() ");
		stringBuilder.append("where id = ?");
//		reply 테이블의 Update 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, replyVO.getReplyContent());
			preparedStatement.setLong(2, replyVO.getId());
//			미리 SQL(Update 쿼리)에 ?로 자리 잡아둔 것을 set 메소드로 각 자리에 값을 채워넣는다.
//			위에 ?가 2개 이므로 2개의 값을 채워 넣어야한다.

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update(ReplyVO) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}

//	삭제
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("delete from tbl_reply ");
		stringBuilder.append("where id = ?");
//		reply 테이블의 delete 쿼리
//		DB에서 데이터를 완전히 삭제한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Hard-delete(Long) SQL문 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}
	}
	

//	전체 조회
	public ArrayList<ReplyDTO> selectAll() {
		ArrayList<ReplyDTO> replies = new ArrayList<ReplyDTO>();
//		결과를 담을 ArrayList 객체를 생성한다
//		ArrayList는 자동으로 크기를 늘릴 수 있다
		ReplyDTO replyDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("select ");
		stringBuilder.append("r.id, r.reply_content, m.member_name, r.post_id, r.member_id, r.created_date, r.updated_date ");
		stringBuilder.append("from tbl_member m ");
		stringBuilder.append("join tbl_reply r on m.id = r.member_id ");
		stringBuilder.append("join tbl_post p on p.id = r.post_id and r.reply_status = 'enable'");
//		reply 테이블의 select 쿼리
//		reply 테이블의 회원과 회원 정보 전체를 조회한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
//			마찬가지로 조회는 executeUpdate()가 아닌 executeQuery()로 확인한다.

			while (resultSet.next()) {
				replyDTO = new ReplyDTO();

				replyDTO.setId(resultSet.getLong("id"));
				replyDTO.setReplyContent(resultSet.getString("reply_content"));
				replyDTO.setMemberName(resultSet.getString("member_name"));
				replyDTO.setPostId(resultSet.getLong("post_id"));
				replyDTO.setMemberId(resultSet.getLong("member_id"));
				replyDTO.setCreatedDate(resultSet.getString("created_date"));
				replyDTO.setUpdatedDate(resultSet.getString("updated_date"));

				replies.add(replyDTO);
			}
//			결과가 있는 동안 반복, 얼마나 반복 할 지 모르기에 while 문 사용

		} catch (SQLException e) {
			System.out.println("selectAll(Long) SQL 오류");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (SQLException e) {
				throw new RuntimeException();
			}
		}

		return replies;
//		최종 회원 리스트를 리턴한다.

	}
}
