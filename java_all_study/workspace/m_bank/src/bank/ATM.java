package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
//   화면

	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[arrBank.length];
		String[] arBankName = { "신한은행", "국민은행", "카카오뱅크" };

		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4. 나가기";
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
		Scanner sc = new Scanner(System.in);

		int bankNumber = 0, choice = 0, myBankNumber = 0;
		String account = null, password = null, phone = null, name = null;
		Bank user = null;
		int money = 0, withdrawMoney = 0, temp = 0;
		Random random = new Random();
//		난수 생성
		int passwordCheck = 0, phoneCheck = 0;

		String accountMessage = "계좌번호: ";
		String nameMessage = "예금주: ";
		String passwordMessage = "비밀번호(4자리): ";
		String phoneMessage = "핸드폰번호(- 제외): ";
		String depositMessage = "입금액: ";
		String withdrawMessage = "출금액: ";
		String errorMessage = "다시 시도해주세요.";
		String loginFailMessage = "계좌번호 혹은 비밀번호를 다시 확인해주세요.";

//		총 몇 번 반복할 지 모르니 while 사용
		while (true) {
			System.out.println(message);
			bankNumber = sc.nextInt();

			if (bankNumber == 4) {
				System.out.println("나가기");
				break;
			}

			bankNumber--;
//			입력값은 사용자에게 1,2,3번 식으로 제시하지만,
//			자바 배열 인덱스는 0,1,2로 시작하기 때문에
//			입력값에서 1을 빼줘야한다.

			while (true) {
				System.out.println(menu);
				choice = sc.nextInt();

				if (choice == 6) {
					break;
				}

//				하나의 변수에 여러 경우의 값이 담길 수 있고,
//				각 값이 같은지 비교하기 위해 switch 사용
				switch (choice) {
				case 1: // 계좌 개설

					Bank[] arBank = { new Shinhan(), new Kookmin(), new Kakao() };
//					3개 은행을 각각 생성해 배열에 넣고,
//					bankNumber를 통해 사용자가 선택한 은행의 객체를 호출한다.
					
					while (true) {
						account = String.valueOf(random.nextInt(900_000) + 100_000);
//						100_000 ~ 999_999 사이의 6자리 난수 계좌 생성
						account = bankNumber + account;
//						bankNumber을 앞에 붙여 은행별 구분
						if (Bank.checkAccount(arrBank, arCount, account) == null) {
//						checkAccount()로 중복 검사
							break;
//							중복이 없으면 탈출
							
						}
					}

					System.out.println(nameMessage);
					name = sc.next();

					while (true) {
						System.out.println(passwordMessage);
						password = sc.next();
						passwordCheck = 0;

						if (password.length() == 4) {
//						비밀번호가 4자리여야만 검사 실행
//						"\\d{4}" : 숫자 4자리 정규표현식
							for (int i = 0; i < password.length(); i++) {
								char c = password.charAt(i);
								if (c >= 48 && c <= 57) {
//								숫자인 문자만 통과, 유니코드 48 = 0, 유니코드 57 = 9
									passwordCheck++;
//									숫자인 경우에만 증감
								}
							}
						}

						if (passwordCheck == 4) {
							break;
						}
//						비밀번호가 숫자 4자리 라면 통화
					}

					while (true) {
						System.out.println(phoneMessage);
						phone = sc.next();
						phoneCheck = 0;

						phone = phone.replaceAll("-", "");
//						"-" 제거

						if (phone.length() == 11) {
							for (int i = 0; i < phone.length(); i++) {
								char c = phone.charAt(i);
								if (c >= 48 && c <= 57) {
									phoneCheck++;
								}
							}

							if (phoneCheck == 11) {
//							전화번호가 11자리여야만 검사 실행
								if (Bank.checkPhone(arrBank, arCount, phone) == null) {
									break;
								}
//								checkPhone(): 전체에서 같은 전화번호가 등록되어 있는지 검사
//								null 이면 중복이 없으므로 전화번호 사용 가능
							}
						}
					}

					user = arBank[bankNumber];
//					사용자가 선택한 은행 번호를 기반으로 은행 객체 1개를 user 에 저장한다.

					user.setAccount(account);
					user.setName(name);
					user.setPassword(password);
					user.setPhone(phone);
//					공용 객체 1개에 이름, 계좌, 비밀번호, 전화번호를 저장합니다

					arrBank[bankNumber][arCount[bankNumber]++] = user;
//					arrBank[bankNumber]: 해당 은행의 고객 배열
//					[arCount[bankNumber]++]: 고객 수 번째에 저장 후, 고객 수 + 1
//					그 자리에 새 고객(user) 저장

					System.out.println(arBankName[bankNumber] + " 가입을 진심으로 환영합니다.");
					System.out.println("고객님의 소중한 계좌번호: " + account);
					break;
					
				case 2: // 입금 하기
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
//					Bank.login() 메소드를 통해 계좌번호와 비밀번호가 일치하는 고객 객체 찾기
//					일치하면 user 에 고객 객체 저장되고, 일치하지 않으면 null

					if (user != null) {
						myBankNumber = user.getAccount().charAt(0) - 48;
//						로그인한 고객의 계좌번호 첫 글자를 가져와 정수로 변환
//						즉, 이 계좌가 신한(0), 국민(1), 카카오(2) 중 어디에 속한 고객인지 판별
						if (myBankNumber == bankNumber) {
//						사용자가 선택한 은행과 로그인한 계좌의 은행이 같은지 확인
							System.out.println(depositMessage);
							money = sc.nextInt();

							if (money > 0) {
//							0보다 큰 금액만 입금 가능	
								user.deposit(money);
//								해당 은행별 오버라이드된 수수료 적용
								System.out.println("현재 잔액: " + user.getMoney() + "원");
							} else {
								System.out.println(errorMessage);
							}
						} else {
							System.out.println(arBankName[myBankNumber] + " 은행에서만 입금 서비스를 이용하실 수 있습니다.");
//							로그인은 성공했지만, 계좌의 실제 은행과 선택 은행이 다를 때
						}
					} else {
						System.out.println(loginFailMessage);
//						로그인 자체가 실패했을 경우
					}
					break;
					
				case 3: // 출금 하기
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);

					if (user != null) {
//					로그인 성공 시
						System.out.println(withdrawMessage);
						withdrawMoney = sc.nextInt();

						temp = user instanceof Kookmin ? (int) (withdrawMoney * 1.5) : withdrawMoney;
//						국민은행 계좌라면 출금액에 1.5배 수수료
						
						if (withdrawMoney > 0) {
//						출금액이 0보다 커야한다.
							if (temp <= user.getMoney()) {
//							잔액이 수수료 포함 출금액보다 많거나 같으면 출금 가능
								user.withdraw(withdrawMoney);
								System.out.println("현재 잔액: " + user.getMoney() + "원");

							} else {
								System.out.println(errorMessage);
							}

						} else {
							System.out.println(errorMessage);
						}
					} else {
						System.out.println(loginFailMessage);
					}
					break;
					
				case 4: // 잔액 조회
					System.out.println(accountMessage);
					account = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.login(arrBank, arCount, account, password);
					if (user != null) {
//					로그인 성공 시
						System.out.println("현재 잔액: " + user.showBalance() + "원");
					}
					break;
					
				case 5: // 계좌번호 찾기
					System.out.println(phoneMessage);
					phone = sc.next();

					System.out.println(passwordMessage);
					password = sc.next();

					user = Bank.checkPhone(arrBank, arCount, phone);
					if (user != null) {
//					전화번호 일치하면
						while (true) {
							account = String.valueOf(random.nextInt(900000) + 100000);
//							100_000 ~ 999_999 사이 랜덤 6자리 숫자 생성
							account = bankNumber + account;
//							은행 번호를 붙여 7자리 계좌번호 생성
							if (Bank.checkAccount(arrBank, arCount, account) == null) {
								break;
							}
//							중복 없으면 신규 계좌 생성
						}

						user.setAccount(account);
//						계좌번호 변경(재발급)
						System.out.println("고객님의 소중한 계좌번호: " + account);
					} else {
						System.out.println(errorMessage);

					}
					break;

				default:
					System.out.println(errorMessage);
					break;
				}
//				어떠한 case 에도 해당하지 않을 때 실행
				
			}
		}
	}
}
