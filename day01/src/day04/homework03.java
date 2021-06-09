package day04;

import java.util.Scanner;

public class homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tid = "qwer1234";
		int tpw = 1234;
		String id;
		String pw;
		
		while (true) {
			System.out.println("아이디 : ");
			id = sc.next();
			System.out.println("비밀번호 : ");
			pw = sc.next();

			if (id.equals(tid)) {
				if (pw.equals(tpw)) {
					System.out.println("로그인 성공!");
					break;
				} else
					System.out.println("로그인 실패, 다시 입력해주세요");
			} else
				System.out.println("로그인 실패, 다시 입력해주세요");
		}
	}
}
