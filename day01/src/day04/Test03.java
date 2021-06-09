package day04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		int a = 0;
		int 플1 = 0;
		int 플2 = 0;

		while (true) {

			Scanner sc = new Scanner(System.in);
//	while(true) // 무한반복 => 계속반복하기

			System.out.println("가위 바위 보 [끝내기 =end] 게임");

			System.out.println("첫번째 플레이어 선택 : ");
			String 플레이어1 = sc.next();
			int 플레이어1수 = 3;

			if (플레이어1.equals("가위"))
				플레이어1수 = 0;

			else if (플레이어1.equals("바위"))
				플레이어1수 = 1;
			else if (플레이어1.equals("보"))
				플레이어1수 = 2;
			else if (플레이어1.equals("end"))
				break;

			else
				System.out.println("잘못입력했습니다.");

			Random random = new Random();
			int 플레이어2수 = random.nextInt(3);
			if (플레이어2수 == 0)
				System.out.println("컴퓨터는 가위 냈습니다.");
			else if (플레이어2수 == 1)
				System.out.println("컴퓨터는 바위 냈습니다.");
			else if (플레이어2수 == 2)
				System.out.println("컴퓨터는 보 냈습니다.");

			// 승리 판단
			if (플레이어1수 == 0) {
				if (플레이어2수 == 2)
					System.out.println("플레이어 1 승리");
				else if (플레이어2수 == 1)
					System.out.println("플레이어2 승리");
				else
					System.out.println("무승부");
			} else if (플레이어1수 == 1) {
				if (플레이어2수 == 0)
					System.out.println("플레이어 1 승리");
				else if (플레이어2수 == 2)
					System.out.println("플레이어2 승리");
				else
					System.out.println("무승부");
			} else if (플레이어1수 == 2) {
				if (플레이어2수 == 0)
					System.out.println("플레이어 2 승리");
				else if (플레이어2수 == 1)
					System.out.println("플레이어1 승리");
				else
					System.out.println("무승부");

			} else {
				System.out.println("잘못 입력된 값이 있습니다 [다시]");
			}
			if (플레이어1수 > 플레이어2수)
				++플1;
			else if (플레이어2수 > 플레이어1수)
				++플2;

			++a;
		}
		System.out.println("총 게임 수 : " + a);
		if (플1 > 플2)
			System.out.println("플레이어1의 최종 승리! " + 플1 + "점");
		else if (플2 > 플1)
			System.out.println("플레이어2 (컴퓨터) 의 최종 승리! " + 플2 + "점");
		else
			System.out.println("무승부");
	}

}
