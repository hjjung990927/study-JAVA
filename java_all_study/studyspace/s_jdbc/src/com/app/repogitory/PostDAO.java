package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.PostVO;
import com.app.domain.dto.PostDTO;

public class PostDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가
	public void insert(PostVO postVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_post");
		stringBuilder.append("(post_title, post_content, member_id) ");
		stringBuilder.append("values(?, ?, ?)");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert(PostVO) SQL 오류");
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
	public void update(PostVO postVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_post ");
		stringBuilder.append("set post_title = ?, post_content = ?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");
//		post 테이블의 Update 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, postVO.getPostTitle());
			preparedStatement.setString(2, postVO.getPostContent());
			preparedStatement.setLong(3, postVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update(MemberVO) SQL문 오류");
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

//	삭제(Soft-delete)
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_post ");
		stringBuilder.append("set post_status = 'disable' ");
		stringBuilder.append("where id = ?");
//		post 테이블에 soft-delete를 하기 위한 Update 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Soft-delete(Long) SQL문 오류");
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

//	삭제(Hard-delete)
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("delete from tbl_post ");
		stringBuilder.append("where id = ?");
//		post 테이블의 delete 쿼리

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

//	조회
	public PostDTO selectOne(Long id) {
		PostDTO postDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append(
				"p.id, p.post_title, p.post_content, p.post_read_count, m.member_name, p.created_date, p.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_post p ");
		stringBuilder.append("on m.id = p.member_id and p.id = ? and p.post_status = 'enable'");
//		post 테이블의 Select 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				postDTO = new PostDTO();

				postDTO.setId(resultSet.getLong("id"));
				postDTO.setPostTitle(resultSet.getString("post_title"));
				postDTO.setPostContent(resultSet.getString("post_content"));
				postDTO.setPostReadCount(resultSet.getInt("post_read_count"));
				postDTO.setMemberName(resultSet.getString("member_name"));
				postDTO.setCreatedDate(resultSet.getString("created_date"));
				postDTO.setUpdatedDate(resultSet.getString("updated_date"));
			}

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
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

		return postDTO;
	}

//	전체 조회
	public ArrayList<PostDTO> selectAll() {
		ArrayList<PostDTO> posts = new ArrayList<PostDTO>();
		PostDTO postDTO = null;
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("p.id, p.post_title, p.post_content, p.post_read_count, m.member_name, p.created_date, p.updated_date ");
		stringBuilder.append("from tbl_member m join tbl_post p ");
		stringBuilder.append("on m.id = p.member_id and p.post_status = 'enable'");
//		post 테이블의 Select 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				postDTO = new PostDTO();

				postDTO.setId(resultSet.getLong("id"));
				postDTO.setPostTitle(resultSet.getString("post_title"));
				postDTO.setPostContent(resultSet.getString("post_content"));
				postDTO.setPostReadCount(resultSet.getInt("post_read_count"));
				postDTO.setMemberName(resultSet.getString("member_name"));
				postDTO.setCreatedDate(resultSet.getString("created_date"));
				postDTO.setUpdatedDate(resultSet.getString("updated_date"));

				posts.add(postDTO);
			}

		} catch (SQLException e) {
			System.out.println("selectOne(Long) SQL 오류");
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

		return posts;
	}
}
