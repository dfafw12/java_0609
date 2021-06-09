package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while(true) // 무한반복 => 계속반복하기
			
		System.out.println("가위 바위 보 게임");
		
		System.out.println("첫번째 플레이어 선택 : ");
		String 플레이어1 = sc.next();
		int 플레이어1수=3;

		if (플레이어1.equals("가위"))
			플레이어1수 = 0;
		else if (플레이어1.equals("바위"))
			플레이어1수 = 1;
		else if (플레이어1.equals("보"))
			플레이어1수 = 2;
		else
			System.out.println("잘못입력했습니다.");

		System.out.println("두번째 플레이어 선택 : ");
		String 플레이어2 = sc.next();
		int 플레이어2수=3;
		if (플레이어2.equals("가위"))
			플레이어2수 = 0;
		else if (플레이어2.equals("바위"))
			플레이어2수 = 1;
		else if (플레이어2.equals("보"))
			플레이어2수 = 2;
		else
			System.out.println("잘못입력했습니다.");

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

		}
		else {
			System.out.println("잘못 입력된 값이 있습니다 [다시]");
		}
	}
}
