package Day11;

public class 신한은행 extends 계좌 {
	int 은행코드 = 01; //식별용
	
	public 신한은행() {}
	
	
	public 신한은행(String 계좌번호, int 금액, int 은행코드) {
		super(계좌번호, 금액);
		this.은행코드 =은행코드;
	}
	
	@Override
	public void 계좌등록() {
		System.out.println("신한은행 계좌 등록");
		System.out.println("계좌번호 : ");
		String 계좌번호 =  Test03.sc.next();
		//리스트에 넣기
		Test03.계좌목록.add( new 신한은행(계좌번호, 0, 은행코드));
		System.out.println("등록 완료");
		
	}

	@Override
	public void 예금() {
		System.out.println("예금");
		예금();
	}

	@Override
	public void 잔고() {
		System.out.println("잔고");
	}

	@Override
	public void 출금() {
		System.out.println("출금");
		계좌찾기();
	}
	@Override
	public void 메뉴() {
		
		super.메뉴();
	}

}
