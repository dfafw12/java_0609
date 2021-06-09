package Day06;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 삼목 게임

		// 1. 게임판 만들기
//		String[] 게임판 = new String[9];
//		게임판[0] = "[]";
//		게임판[1] = "[]";
//		게임판[2] = "[]";
//		게임판[3] = "[]";
//		게임판[4] = "[]";
//		게임판[5] = "[]";
//		게임판[6] = "[]";
//		게임판[7] = "[]";
//		게임판[8] = "[]";
		String[] 게임판 = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
		while (true) {
			// 2. 게임판 출력
			for (int i = 0; i < 게임판.length; ++i) {
				// 3개 씩 출력후 줄바꿈
				System.out.print(게임판[i]);
				if (i % 3 == 2)
					System.out.println();

			}

			// 3. 사용자에게 입력받아 알놓기.
			// 이미 둔 자리에는 입력할수 없도록 X
			while (true) {
				System.out.println("번호 선택 [0~8]");
				int 선택 = sc.nextInt();

				if (게임판[선택].equals("[ ]")) {
					게임판[선택] = "[O]";
					break;
				} else
					System.out.println("이미 둔 자리입니다 [다른곳 선택]");
			}
			// 4. 컴퓨터 플레이어
			System.out.println("컴퓨터 순서 입니다.");
			Random random = new Random();
			while (true) {
				int 선택 = random.nextInt(9);
				if (게임판[선택].equals("[ ]")) {
					게임판[선택] = "[X]";
					break;
				}
			}
			String 승리패 = "O";
			// 5. 이기는 경우의 수
			// 012,345,678,037,148,269,048,246
//			if (게임판[0].equals("[X]") && 게임판[1].equals("[X]") && 게임판[2].equals("[X]") ) System.out.println(" 컴퓨터 승리!");
//			if (게임판[3].equals("[X]") && 게임판[4].equals("[X]") && 게임판[5].equals("[X]") ) System.out.println(" 컴퓨터 승리!");
//			if (게임판[6].equals("[X]") && 게임판[7].equals("[X]") && 게임판[8].equals("[X]") ) System.out.println(" 컴퓨터 승리!");
			for (int i = 0; i <= 6; i += 3) {
				if (게임판[i].equals(게임판[i + 1]) && 게임판[i + 1].equals(게임판[i + 2])) {
					if (!게임판[i].equals("[ ]"))
						승리패 = 게임판[i];
				}
			}
			if (게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8])) {
				if (!게임판[0].equals("[ ]"))
					승리패 = 게임판[0];
			}
			if (게임판[0].equals(게임판[3]) && 게임판[3].equals(게임판[6])) {
				if (!게임판[0].equals("[ ]"))
					승리패 = 게임판[0];
			}


			if (승리패.equals("[O]")) {
				System.out.println("플레이어 승리!");
				break;

			} else if (승리패.equals("[X]")) {
				System.out.println("컴퓨터 승리!");
				break;
			}
		}
	}
}
