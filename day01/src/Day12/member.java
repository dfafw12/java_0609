package Day12;

import java.util.Scanner;

public class member {
	Scanner sc = new Scanner(System.in);
	private String id;
	private String pw;
	private String name;

	public member() {
	}

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

	//생성자, get메소드 ,set 메소드, => 자동완성가능
	//	마우스 우클릭 => source
	
	public static void login(String id, String pw) throws Exception {
		
		if(!id.equals("qwe")) {
			//예외만들기
			throw new Exception("아이디가 다릅니다");
		}
		if(!pw.equals("qwe")) {
			throw new Exception("비밀번호가 다릅니다");
			
		}
		System.out.println("로그인 성공");
			
		
	}

}
