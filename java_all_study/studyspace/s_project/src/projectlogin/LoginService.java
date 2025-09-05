package projectlogin;

import java.util.ArrayList;

public class LoginService {
	private ArrayList<User> users = new ArrayList<User>();
	

//	회원가입
	public void join(User user) {
		if(users.contains(user)) {
			System.out.println("중복된 계정입니다.");
		} else {
			users.add(user);
			System.out.println("회원 가입 되었습니다.");
		}
	}

//	로그인
	public void login(String id, String password) {
		User loginUser = new User(id, password);		
		for(User user : users) {
			if(user.equals(loginUser)) {
				System.out.println("로그인 성공");
				return;
			}
		}
		System.out.println("로그인 실패");
	}
	
//	
}
