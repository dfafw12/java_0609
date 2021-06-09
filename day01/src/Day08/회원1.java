package Day08;

import java.util.Scanner;

public class 회원1 {
	Scanner sc = new Scanner(System.in);
	String id, pw, name, pn;

	public 회원1(String id, String pw, String name, String pn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pn = pn;

	}

	public void 회원가입() {


		System.out.println("회원가입 진행");

		System.out.println("아이디 : ");
		id = sc.next();
		System.out.println("비밀번호 : ");
		pw = sc.next();
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("연락처 : ");
		pn = sc.next();
		회원1 temp = new 회원1(id, pw, name, pn);
		

	}

}
