package bank;

public class Bank {
	private String name;
	private String account;
	private String phone;
	private String password;
	private int money;
//	다른 클래스에서 접근 할 수 없는 변수 선언
//	주로 메소드로 접근할 수 있다.

	public Bank() {
		;
	}
//	기본 생성자
	
	public Bank(String name, String account, String phone, String password, int money) {
//	Bank 클래스의 생성자, 객체를 만들 때 정보를 받아 초기화
		this.name = name;
		this.account = account;
		this.phone = phone;
		this.password = password;
		this.money = money;
//		매개변수 name,account, ...,money 값을 각각의 클래스의 name,account, ...,money 필드에 저장		
	}
//	Bank 클래스의 사용자 정의 생성자
//	고객의 정보를 받아 각각의 필드에 저장한다.

	public String getName() {
		return name;
	}
//	getName: 이름 가져오기
//	가져온 필드(이름) 값을 외부로 전달하기 위해 return(반환)

	public void setName(String name) {
		this.name = name;
	}
//	setName: 이름 설정하기
//	외부에서 받은 값을 내부 필드(이름)에 저장
	
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
//	각각의 필드에 대해 값을 가져오고(get), 값을 설정(set)한다.

//  계좌번호 중복검사
	public final static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		arrBank: 2차원 배열, Bank[은행3개][고객 최대 100명]
//		arCount: 각 은행에 등록된 고객 수
//		account: 찾고자 하는 계좌번호
		
		Bank bank = null;
//		기본 값을 null 초기화
		for (int i = 0; i < arrBank.length; i++) {
//		3개의 은행(i)을 순회
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
//			해당 은행의 고객 수(j)만큼 반복
				if(arrBank[i][j].getAccount().equals(account)) {
//				i번째 은행의 j번째 고객(Bank 객체)
//				해당 고객의 계좌번호 가져오기
//				입력받은 계좌번호와 같은지 비교, 문자열 내용 비교엔 .equals() 사용
					bank = arrBank[i][j];
//					중복된 계좌를 찾았다는 의미
//					해당 고객 정보를 임시로 'bank'에 저장
					break;
				}
			}
			if(j != arCount[i]) {
				break;
			}
//			계좌를 찾았으면 반복문 탈출
		}
		
		return bank;
//		반환 값이 bank: 중복이 있어 다른 번호 요구
//		반환 값이 null: 중복이 없어 번호 사용 가능
	}

//  핸드폰 번호 중복검사
	public final static Bank checkPhone(Bank[][] arrBank, int[] arCount, String phone) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0 ;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhone().equals(phone)) {
					bank = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {
				break;
			}
		}

		return bank;
	}

//  로그인
	public final static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
//		계좌번호로 고객 찾기
//		checkAccount() 호출해서 입력한 account 가 등록된 고객인지 확인
		
		if(user != null) {
//		계좌번호가 null 이 아니라면, 즉 계좌번호가 존재한다면
			if(user.password.equals(password)) {
//			비밀번호도 일치한다면
				return user;
//				로그인 성공, 해당 고객 객체 반환
			}
		}
		
		return null;
//		로그인 실패, 계좌번호가 없거나 비밀번호 불일치
	}

//  입금
	public void deposit(int money) {
		this.money += money;
	}
//	외부에서 입금할 금액을 받아 
//	현재 잔액(this.money)에 더해준다.

//  출금
	public void withdraw(int money) {
		this.money -= money;
	}

//  잔액 조회
	public int showBalance() {
		return money;
	}

}
