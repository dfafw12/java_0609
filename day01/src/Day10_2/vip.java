package Day10_2;

public class vip extends 회원 {
	String 회원등급;

	public vip(String 회원등급) {

		this.회원등급 = 회원등급;
	}

	public vip(String 아이디, String 비밀번호, String 회원등급) {
		super(아이디, 비밀번호);
		this.회원등급 = 회원등급;

	}

	@Override
	public void 정보() {

		super.정보();
		System.out.println("회원등급 : " + this.회원등급);

	}

}
