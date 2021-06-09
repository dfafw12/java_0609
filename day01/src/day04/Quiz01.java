package day04;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 문제 4 : 자판기 만들기 [콜라[재고 : 10개]] => 500원 사이다 [재고 :5개] = > 600원, 환타[재고 :7개] =>
		// 700원
		// 1. 자판기 프로그램 무한루프
		// 2. 사용자에게 금액을 입력 받기
		// 3. 입력받은 금액으로 제품 구매
		// 1. 제품 번호와 갯수 입력받아 구매
		// 4. 최종 구매, 재고 감소, 매출 증가
		Scanner sc = new Scanner(System.in);

		while (true) { // 무한 루프
			System.out.println(" 자판기 ");
			System.out.println("금액을 넣어주세요 : ");
			int dr = sc.nextInt();

			int 총금액 = 0;

			int 콜라재고 = 10;
			int 사이다재고 = 5;
			int 환타재고 = 7;
			int 콜라구매수 = 0;
			int 사이다구매수 = 0;
			int 환타구매수 = 0;

			while (true) {
				System.out.println("1.콜라[500원], 2.사이다[600원], 3.환타[700원], 4.결제");
				int 선택 = sc.nextInt();

				if (선택 == 1) {

					System.out.println("구매 개수 : ");
					콜라구매수 = sc.nextInt();
					if (콜라구매수 > 콜라재고) {
						System.out.println("재고 부족");
					} else if ((콜라구매수 * 500) > dr) {
						System.out.println("금액 부족");
					} else {
						System.out.println("장바구니에 추가");

						if ((총금액 += 콜라구매수 * 500) > dr) {
							System.out.println("금액 부족");
						} else {
							총금액 += 콜라구매수 * 500;
							콜라재고 -= 콜라구매수;
					}
				}
				if (선택 == 2) {
					System.out.println("구매 개수 : ");
					사이다구매수 = sc.nextInt();
					if (사이다구매수 > 사이다재고) {
						System.out.println("재고 부족");
					} else if ((사이다구매수 * 600) > dr) {
						System.out.println("금액 부족");
					} else {
						System.out.println("장바구니에 추가");

						if ((총금액 += 사이다구매수 * 600) > dr) {
							System.out.println("금액 부족");
						} else {
							총금액 += 사이다구매수 * 600;
							사이다재고 -= 사이다구매수;
					}
				}
				}
				if (선택 == 3) {
					System.out.println("구매 개수 : ");
					환타구매수 = sc.nextInt();
					if (환타구매수 > 환타재고) {
						System.out.println("재고 부족");
					} else if ((환타구매수 * 700) > dr) {
						System.out.println("금액 부족");
					} else {
						System.out.println("장바구니에 추가");

						if ((총금액 += 환타구매수 * 700) > dr) {
							System.out.println("금액 부족");
						} else {
							총금액 += 환타구매수 * 500;
							환타재고 -= 환타구매수;
					}
				}
				}
				if (선택 == 4) {
					System.out.println("장바구니");
					if (콜라구매수 != 0)
						System.out.println("콜라 개수 : "+콜라구매수+"\n"+"사이다 개수 : "+사이다구매수+"\n"+"환타 개수 : "+환타구매수+"\n");

				}
				}

			}
		}
	}

}
