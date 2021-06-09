package Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class user {
	
	private String id;
	private String pw;
	private String name;

	// 생성자, get, set
	public user() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public user(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public void signup() throws Exception {
		
			System.out.println("회원가입");
			System.out.println("아이디 : ");
			String id = Test02.sc.next();
			System.out.println("비밀번호 : ");
			String pw = Test02.sc.next();
			System.out.println("성명 : ");
			String name = Test02.sc.next();
			
			user temp = new user(id, pw, name);
			Test02.userlist.add(temp);
			// 파일에 저장
			Fileutil.파일쓰기("c:/java/","userlist3.txt", Test02.userlist);
			System.out.println("회원가입 성공");
			
		
	}
	public void login() {
		System.out.println("로그인");
		System.out.println("아이디 : ");
		String id = Test02.sc.next();
		System.out.println("비밀번호 : ");
		String pw = Test02.sc.next();
		
		
	}


}