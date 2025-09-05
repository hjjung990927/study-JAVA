package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.member.MemberGender;

public class MemberDAO {
	private Connection connection;
//	내가 설정한 RDB의 연결 객체
	private PreparedStatement preparedStatement;
//	내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private ResultSet resultSet;
//	조회 결과를 담아줄 객체

//	추가
	public void insert(MemberVO memberVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_member ");
		stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");
//		member 테이블의 Insert 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
//			DB 연결
			preparedStatement = connection.prepareStatement(query);
//			SQL 연결

			preparedStatement.setString(1, memberVO.getMemberEmail());
			preparedStatement.setString(2, memberVO.getMemberPassword());
			preparedStatement.setString(3, memberVO.getMemberName());
			preparedStatement.setInt(4, memberVO.getMemberAge());
			preparedStatement.setString(5, memberVO.getMemberGender().getValue());
//			.getValue(): enum 안에 실제 저장할 문자열 가져오기
			
//			미리 SQL(Insert 쿼리)에 ?로 자리 잡아둔 것을 set 메소드로 각 자리에 값을 채워넣는다.
//			위에 ?가 5개 이므로 5개의 값을 채워 넣어야한다.

			preparedStatement.executeUpdate();
//			준비된 객체에서 쿼리문 실행한다.
//			executeUpdate(): Insert, Update, Delete 에서 사용

		} catch (SQLException e) {
			System.out.println("insert(MemberVO) SQL 오류");
			e.printStackTrace();
//		SQL 오류가 나면 잡는다.

		} catch (Exception e) {
			e.printStackTrace();
//		SQLException 외 다른 예외를 잡는다.

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
//				preparedStatement 객체가 생성되어 메모리에 존재하면(null 이 아니면) 닫는다.
				if (connection != null) {
					connection.close();
				}
//				RDB의 연결이 정상적으로 작동하면 닫는다.

			} catch (SQLException e) {
				throw new RuntimeException();
			}
//			close() 실행 실패 시 다시 던진다.
		}
	}

//	수정
	public void update(MemberVO memberVO) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("update tbl_member ");
		stringBuilder.append(
				"set member_password=?, member_name=?, member_age=?, member_gender=?, updated_date=current_timestamp() ");
		stringBuilder.append("where id = ?");
//		member 테이블의 Update 쿼리

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, memberVO.getMemberPassword());
			preparedStatement.setString(2, memberVO.getMemberName());
			preparedStatement.setInt(3, memberVO.getMemberAge());
			preparedStatement.setString(4, memberVO.getMemberGender().getValue());
			preparedStatement.setLong(5, memberVO.getId());
//			미리 SQL(Update 쿼리)에 ?로 자리 잡아둔 것을 set 메소드로 각 자리에 값을 채워넣는다.
//			위에 ?가 5개 이므로 5개의 값을 채워 넣어야한다.

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

//	삭제(deleteSoft)
	public void deleteSoft(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("update tbl_member ");
		stringBuilder.append("set member_status = 'disable' ");
//		disable 은 고정된 문자열이기에 꼭 ''을 써준다.
		stringBuilder.append("where id = ?");
//		member 테이블에 soft-delete를 하기 위한 Update 쿼리
//		실제로 삭제하지 않고 status 만 바꿔 복구 가능하게 한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();
//			미리 SQL(Update 쿼리)에 ?로 자리 잡아둔 것을 set 메소드로 각 자리에 값을 채워넣는다.
//			위에 ?가 1개 이므로 1개의 값을 채워 넣어야한다.

		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
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

//	삭제(deleteHard)
	public void deleteHard(Long id) {
		String query = null;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("delete from tbl_member ");
		stringBuilder.append("where id = ?");
//		member 테이블의 delete 쿼리
//		DB에서 데이터를 완전히 삭제한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setLong(1, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			System.out.println("deleteHard(Long) SQL문 오류");
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
	public Optional<MemberVO> selectOne(Long id) {
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member ");
		stringBuilder.append("where id = ?");
//		member 테이블의 select 쿼리
//		id 값으로 회원 한명만 조회한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);

			resultSet = preparedStatement.executeQuery();
//			select 실행 후 결과는 resultSet에 담긴다.
//			조회는 executeUpdate()가 아닌 executeQuery()로 확인한다.

			if (resultSet.next()) {
				memberVO = new MemberVO();
//				한 명의 회원 정보를 담을 객체
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));
//				DB에서 조회한 각 컬럼들의 값을 꺼내 객체 필드에 저장한다.
			}
//			한 명만 조회이기 때문에 일정 횟수를 알수 있을 때 사용하는 if 문으로 체크한다.

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
//				resultSet에 값이 담기면(null 이 아니면) 닫는다.
				
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
		return Optional.ofNullable(memberVO);
//		결과가 없으면 Optional.empty()로 변환한다.
//		Optional.empty(): 값이 없는 상태를 의미한다.
	}

//	전체 조회
	public ArrayList<MemberVO> selectAll() {
		ArrayList<MemberVO> members = new ArrayList<MemberVO>();
//		결과를 담을 ArrayList 객체를 생성한다
//		ArrayList는 자동으로 크기를 늘릴 수 있다
		MemberVO memberVO = null;
		String query = null;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("select ");
		stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
		stringBuilder.append("from tbl_member");
//		member 테이블의 select 쿼리
//		member 테이블의 회원과 회원 정보 전체를 조회한다.

		query = stringBuilder.toString();

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
//			마찬가지로 조회는 executeUpdate()가 아닌 executeQuery()로 확인한다.

			while (resultSet.next()) {
				memberVO = new MemberVO();
				memberVO.setId(resultSet.getLong("id"));
				memberVO.setMemberEmail(resultSet.getString("member_email"));
				memberVO.setMemberName(resultSet.getString("member_name"));
				memberVO.setMemberAge(resultSet.getInt("member_age"));
				memberVO.setMemberGender(resultSet.getString("member_gender"));

				members.add(memberVO);
			}
//			결과가 있는 동안 반복, 얼마나 반복 할 지 모르기에 while 문 사용

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
//		최종 회원 리스트를 리턴한다.
	}
}
