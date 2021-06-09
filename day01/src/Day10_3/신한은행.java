package Day10_3;

public class 신한은행 extends 계좌 {
	int 은행코드 = 01;

	public 신한은행 () {}
	
	public 신한은행(int 계좌번호, int 비밀번호) {
		super(계좌번호, 비밀번호);
		
	}

	@Override
	public void 입금(int 입금액) {
		System.out.println("신한은행 입금 완료");
		super.입금(입금액);
	}

	@Override
	public void 출금(int 출금액) {
		System.out.println("신한은행 출금 완료");
		super.출금(출금액);
	}

}
