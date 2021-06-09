package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static ArrayList<계좌> 계좌목록 = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	// static : 메모리 우선할당 => 프로그램실행시 할당/ 프로그램종료시 초기화
	// 사용목적 : 프로그램 전체 사용되는 메모리

	public static void main(String[] args) {

		ATM atm = null;
		atm = new 계좌();
		while (true) {
			System.out.println("1.신한은행 2. 국민은행 3. 농협은행 4. 종료");
			int 은행 = sc.nextInt();

			if (은행 == 1) {
				System.out.println("신한은행 연결");
				atm = new 신한은행();
				atm.메뉴();
			}
			if (은행 == 2) {
				System.out.println("국민은행 연결");
				atm = new 국민은행();
			}
			if (은행 == 3) {
				System.out.println("농협은행 연결");
				atm = new 농협은행();
			}
			if (은행 == 4)
				break;
		}

	}
}
