package Day05;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// for문
		// if 문, for문 () => ; [X]

		for (int i = 0; i < 10; ++i) {
			// i가 0부터 10미만 까지 1씩 증가하면서 반복
			System.out.println(i);
			
			 // 1. 초기값 검사 
			 // 2. 조건문 검사 
			 // 3. 코드 실행 
			 // 4. 증감식 => 조건문 검사[True] => 코드실행 (반복) 
			 // 5. 증감식 => 조건문 검사 [False] => 반복문 탈출
			 
		}
		System.out.println();
		System.out.println();
		// 예제 : 1~50까지 출력
		for (int i = 1; i <= 50; ++i) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println();
		// 예제2 : 1~50 까지 3씩 증가
		for (int i = 1; i <= 50; i += 3) {
			System.out.println(i);
		}
		// 예제 3 : 1~50 까지 누적합계
		int a = 0;
		for (int i = 1; i <= 50; i++) {
			a += i;
		}
		System.out.println("1~50까지의 합계 : " + a);
		// 예제4 : 1~50 까지의 3배수의 누적합계
		int b = 0;
		for (int i = 0; i <= 50; i += 3) {
			b += i;
		}
		System.out.println("1~50까지의 3배수 합계 : " + b);
		int c = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0)
				c += i;
		}
		System.out.println("누적합계 : " + c);

		// 예제5: 2단 구구단
		for (int i = 1; i < 10; ++i) {
			System.out.println("2X" + i + "=" + (2 * i));
		}
		System.out.println();
		System.out.println();

		// 예제6 : 구구단 [for문 중첩]
		// for 안에 for => 첫번재 for 1번 반복 => 두번째 for 모든 반복

		for (int i = 2; i < 10; ++i) {
			for (int j = 1; j < 10; ++j) {
				System.out.println(i + "X" + j + "=" + (i * j));
			}
		}
		
		//예제 7 : 입력한 정수만큼 별[*] 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int d = sc.nextInt();
		for(int i  = 1; i<=d; ++i) {
			System.out.print("*");
		}
		

	}
}
