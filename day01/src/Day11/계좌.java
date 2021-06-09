package Day11;

public class 계좌 implements ATM {
	String 계좌번호;
	int 금액;

	public 계좌() {
	}

	public 계좌(String 계좌번호, int 금액) {

		this.계좌번호 = 계좌번호;
		this.금액 = 금액;
	}

	@Override
	public void 계좌등록() {
		System.out.println("계좌 등록 진행");

	}

	@Override
	public void 예금() {
		System.out.println("예금 진행");

	}

	@Override
	public void 잔고() {
		System.out.println("잔고 : ");

	}

	@Override
	public void 출금() {
		System.out.println("출금 진행");

	}

	@Override
	public void 메뉴() {
		System.out.println("===메뉴===");

		System.out.println("===ATM메뉴===");
		System.out.println("1. 계좌등록 2. 예금 3. 잔고확인 4. 출금 5. 종료");
		int 선택 = Test03.sc.nextInt();
		if (선택 == 1) {
			계좌등록();

		}
		if (선택 == 2) {
			System.out.println("예금");
			int result = 계좌찾기();
			if (result == -1)
				return;
			else {
				System.out.println(" 예금할 금액 : ");
				int 금액 = Test03.sc.nextInt();
				Test03.계좌목록.get(result).금액 += 금액;
				System.out.println("입금성공");
			}
		}
		if (선택 == 3) {
			System.out.println("잔고");
			int result =계좌찾기();
			if(result == -1 ) return;
			else {
				System.out.println("현재 잔고 : " + Test03.계좌목록.get(result).금액);
			}
				
			
		}
		if (선택 == 4) {
			int result = 계좌찾기();
			if (result == -1)
				return;
			else {
				System.out.println(" 출금할 금액 : ");
				int 금액 = Test03.sc.nextInt();
				//조건 : 예금보다 더큰 금액은 출금 불가
				if(Test03.계좌목록.get(result).금액 < 금액) {
					System.out.println("예금액이 부족합니다.");
					return; // 메소드 종료
				}
				Test03.계좌목록.get(result).금액 -= 금액;
				System.out.println("출금성공");
			}
			if (선택 == 5) {
				return;
			}
		}

	}

	@Override
	public int 계좌찾기() {
		System.out.println("계좌번호 : ");
		String 계좌번호 = Test03.sc.next();

		// for문 활용 => 리스트 for문
		for (int i = 0; i < Test03.계좌목록.size(); ++i) {
			계좌 temp = Test03.계좌목록.get(i);
			if (temp.계좌번호.equals(계좌번호)) {
				return i;

			}

		}
		System.out.println("동일 계좌 없음");
		return -1;
	}

}
