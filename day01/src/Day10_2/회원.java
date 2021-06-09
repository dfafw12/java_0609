package Day10_2;

public class 회원 {
	String 아이디, 비밀번호;

	public 회원() {
	}

	public 회원(String 아이디, String 비밀번호) {
		this.비밀번호 = 비밀번호;
		this.아이디 = 아이디;
	}

	public void 정보() {

		System.out.println("아이디 : " + this.아이디);
		System.out.println("비밀번호 : " + this.비밀번호);

	}
}
