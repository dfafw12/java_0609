package Day11;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// extends :상속
		// implements : 인터페이스 연결
		// 1. 인터페이스 객체

		키오스크 키오스크 = null; // 공백처리
		// 키오스크 키오스크; // 쓰레기값 [임의값]

		// 2. 연결 대상 선택
		System.out.println("1. 롯데리아, 2. 카페");
		int 연결대상 = sc.nextInt();

		if (연결대상 == 1)
			키오스크 = new 롯데리아();
		if (연결대상 == 2)
			키오스크 = new 카페();

		while (true) {
			System.out.println("===키오스크===");
			System.out.println("1.메뉴, 2. 장바구니, 3. 결제, 4. 종료");
			int 선택 = sc.nextInt();

			if (선택 == 1)
				키오스크.메뉴();
			if (선택 == 2)
				키오스크.장바구니();
			if (선택 == 3)
				키오스크.결제();
			if (선택 == 4)
				키오스크.종료();
			break;
		}

	}
}
