package Day10_2;

public class 관리자 extends 회원 {
	String 관리자직급;

	public 관리자(String 아이디, String 비밀번호, String 관리자직급) {
		super(아이디, 비밀번호);
		this.관리자직급 = 관리자직급;
	}

	@Override
	public void 정보() {
		super.정보();
		System.out.println("관리자 직급 : " + 관리자직급);
	}

}
