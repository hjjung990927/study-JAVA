package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.member.MemberGender;

public class MemberDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가
	public void insert(MemberVO memberVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_member");
		stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender)");
		stringBuilder.append("values(?, ?, ?, ?, ?)");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberGender().getValue());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("insert(MemberVO) SQL 오류");
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
	public void update(MemberVO memberVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("update tbl_member");
		stringBuilder.append(
				"set member_password=?, member_name=?, member_age=?, member_gender=?, updated_date=current_timestamp()");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setInt(3, memberVO.getMemberAge());
			preparedStatement.setString(4, memberVO.getMemberGender().getValue());
			preparedStatement.setLong(5, memberVO.getId());

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
		stringBuilder.append("update tbl_member");
		stringBuilder.append("set member_status = disable");
		stringBuilder.append("where id = ?");

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
		stringBuilder.append("delete from tbl_member");
		stringBuilder.append("where id = ?");

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
	public MemberVO selectOne(Long id) {
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				MemberGender memberGender = null;
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				switch (resultSet.getString("member_gender")) {
				case "남":
					memberGender = MemberGender.MAN;
					break;
				case "여":
					memberGender = MemberGender.WOMAN;
					break;
				case "선택안함":
					memberGender = MemberGender.NONE;
					break;
				}
				memberVO.setMemberGender(memberGender);
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
		return memberVO;
	}

//	전체 조회
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member ");

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				MemberGender memberGender = null;
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				switch (resultSet.getString("member_gender")) {
				case "남":
					memberGender = MemberGender.MAN;
					break;
				case "여":
					memberGender = MemberGender.WOMAN;
					break;
				case "선택안함":
					memberGender = MemberGender.NONE;
					break;
				}
				memberVO.setMemberGender(memberGender);

				members.add(memberVO);
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
		return members;
	}

}
