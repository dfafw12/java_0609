package Day07;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 회원제 프로그램 [ 회원가입, 로그인]
		// 1. 2차원 배열
		// 2. 메뉴 [무한루프]
		// 1. 회원가입
		// 1. 아이디와 비밀번호를 입력받아 배열에 저장
		// 2. 로그인
		// 1. 아이디와 비밀번호 입력받아 배열에 존재하면 로그인 성공
		// 3. 종료
		// 반복문 종료
		Scanner sc = new Scanner(System.in);
		String[][] user = new String[100][2];
		String tid = null;
		String tpw = null;
		int cnt = 0;
		while (true) { // 로그인 성공시 탈출하는 반복문
			System.out.println("1.회원가입, 2. 로그인, 3. 종료");
			int a = sc.nextInt();

			if (a == 1) {

				System.out.println("회원가입 진행");
				System.out.println("아이디 입력 : ");
				tid = sc.next();
				System.out.println("비밀번호 입력 : ");
				tpw = sc.next();
				// 입력받은 값을 저장 => 배열에 빈곳에 저장
				
				if (cnt == 0) {
					for (int i = 0; i < user.length; ++i) {
						if (user[i][0] == null) {
							user[i][0] = tid;
							user[i][1] = tpw;
							System.out.println("회원가입 완료!");
							break; // for문 종료
						} else if (user[i][0].equals(tid)) {
							cnt = 1;
							System.out.println("이미 존재하는 아이디 입니다.");
							break;
						}

					}

				}
			}
			if (a == 2) {
				System.out.println("로그인 진행");
				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("비밀번호 : ");
				String pw = sc.next();
				for (int i = 0; i < user.length; ++i) {
					if (user[i][0] != null) {

						if (user[i][i] != null && cnt == 0) {
							if (user[i][0].equals(id) && user[i][1].equals(pw)) {
								System.out.println("로그인 성공!");
								// 모든 회원 아이디 /비밀번호 출력
								System.out.println("아이디\t\t비밀번호");
								for (int j = 0; j < user.length; ++j) {
									if (user[j][0] != null) {
										System.out.println(user[j][0] + "\t\t" + user[j][1]);

									}
								}
								System.out.println("1.회원 탈퇴, 2. 비밀번호 변경, 3. 로그아웃");
								int b = sc.nextInt();
								if (b == 1) {
									// 회원탈퇴 >> null로 변경
									user[i][0] = null; // 현재 로그인 된 행 = i
									user[i][1] = null;
										// 탈퇴한 회원 이후 회원을 한칸씩 당기기
									for(int h=i; h<99; ++h) {
										if (user[h+1][0] !=null) { //다음 회원이 null 아니면
											
											user[h][0] = user[h+1][0];
											user[h][1] = user[h+1][1];
													
										}else {
											
											user[h][0] = null;
											user[h][1] = null;
											
										}
									}
									System.out.println("회원 탈퇴 성공");
								}
								if(b==2) {
									System.out.println("변경할 비밀번호 입력 : ");
									String cpw = sc.next();
									user[i][1] = cpw ;
									System.out.println("변경 완료! ==> 로그아웃");
									break;
								}
								if (b == 3) {
									System.out.println("로그아웃 성공");
									break;
								}
							}
						}

					}
				}

			}
			if (a == 3) {
				System.out.println("종료");
				break;

			}

		}
	}
}
