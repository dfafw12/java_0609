package Day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 학생 점수 관리 프로그램
		// 1.1차원배열 사용
		// 2 . 메뉴 <= while 사용
		// 1. 학생수 //배열 크기가 선언
		// 2. 점수 입력 // 학생 수만큼 점수 입력
		// 3. 통계 // 1등학생, 평균, 내림차순 정렬 출력
		// 4. 종료
		Integer [] st = null;
		
		

		while (true) {

			Scanner sc = new Scanner(System.in);
			System.out.println("학생 점수 관리 프로그램");
			System.out.println("1.학생수, 2. 점수, 3.통계, 4.종료");
			int a = sc.nextInt();

			if (a == 1) {
				System.out.println("학생수 입력 : ");
				int b = sc.nextInt();
				st = new Integer[b];
			}
			if (a == 2) {
				for (int i = 0; i < st.length; ++i) {
					System.out.println("점수 입력 : ");
					st[i] = sc.nextInt();
				}
				System.out.println("모든학생의 점수를 입력 받았습니다.");

			}
			if (a == 3) {
				// Arrays : 배열클래스
				// .sort(배열명) : 정렬(오름차순) 메소드
				Arrays.sort(st);
				Arrays.sort(st, Collections.reverseOrder());
				for (int i = 0; i < st.length; ++i) {
					System.out.println((i + 1) + "등 점수 : " + st[i]);
				}
				int max = 0;
				int sum = 0;
					for(int i=0; i <st.length; ++i) {
						sum += st[i];
						if (max < st[i]) {
							max =st[i] ;
						}
					}
					System.out.println("가장 높은 점수 : " + max);
					System.out.println("평균 점수 : "+ (sum/st.length));
				
			}
			if (a == 4)
				break;
		}

	}
}
