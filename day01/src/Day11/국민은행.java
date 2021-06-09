package Day11;

public class 국민은행 extends 계좌 {
	int 은행코드 = 02;
	
	public 국민은행() {}
	
	public 국민은행(String 계좌번호, int 금액, int 은행코드) {
		super(계좌번호, 금액);
		this.은행코드 =은행코드;
	}


	@Override
	public void 계좌등록() {
		// TODO Auto-generated method stub
		super.계좌등록();
	}

	@Override
	public void 예금() {
		// TODO Auto-generated method stub
		super.예금();
	}

	@Override
	public void 잔고() {
		// TODO Auto-generated method stub
		super.잔고();
	}

	@Override
	public void 출금() {
		// TODO Auto-generated method stub
		super.출금();
	}
	@Override
	public void 메뉴() {
		
		super.메뉴();
	}

}
