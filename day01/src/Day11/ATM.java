package Day11;

public interface ATM {
	int 입금액 = 0;
	int 출금액 = 0;

	public void 메뉴();

	public void 계좌등록();

	public void 예금();

	public void 출금();

	public void 잔고();
	
	public int 계좌찾기();

	public default void 종료() {
		System.out.println("ATM종료");
	}
}
