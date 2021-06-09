package Day12;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pw, name;
		// 문제1. 회원가입
		// 1] member 클래스를 생성해서 필드 정의
		// 2] 모든필드 private 선언 : 아이디 ,비밀번호 , 성명
		// 3] 아이디와 비밀번호, 성명을 입력받기
		// 4] 객체 생성하여 public 메소드를 통한 저장
		// 5] public 메소드 필드 호출
		

		// 문제2. 로그인

		System.out.println("아이디 입력 : ");
		id = sc.next();
		System.out.println("비밀번호 입력: ");
		pw = sc.next();
		System.out.println("이름 입력 : ");
		name = sc.next();

		member user = new member();
		user.setId(id);
		user.setPw(pw);
		user.setName(name);

		user.getId();
		user.getPw();
		user.getName();
		System.out.println("아이디 : " + user.getId());
		System.out.println("비밀번호 : " + user.getPw());
		System.out.println("이름 : " + user.getName());

		try {
			user.login(id, pw);
		} catch (Exception e) {
			System.out.println("로그인 실패");
			System.out.println("실패 사유 : " + e);
		}

	}

}
