package day04;

import java.util.Scanner;

public class homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("정수 1 : ");
		a = sc.nextInt();
		System.out.println("정수 2 : ");
		b = sc.nextInt();
		System.out.println("정수 3 : ");
		c = sc.nextInt();

		if (a > b) { // 첫번째, 두번째 값 비교 => 교환
			int tmp = a;
			a = b;
			b = tmp;
		}
		if (b > c) {// 두번째, 세번째 값 비교 => 교환
			int tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b) {// 첫번재, 두번째 값 비교 => 교환
			int tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println("오름차순 정렬 : " + a + "\t" + b + "\t" + c + " 순입니다");
	}
}
