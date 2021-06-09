package Day02;

import java.util.Scanner;

public class Day02_0 {
	public static void main(String[] args) {

		// 예제1 : 2명의 이름과 1교시 ~ 3교시 까지의 데이터 입력받아 출력
//		System.out.println("===========출석부============");
//		System.out.println("성명 \t1교시 \t2교시 \t3교시");
//		System.out.println("유재석 \t출석 \t결석 \t출석");
//		System.out.println("강호동 \t결석 \t출석 \t출석");
//		System.out.println("===========================");

		// 입력받아 => 변수에 저장 => 변수를 출력
		// 1. 입력장치 객체 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 학생명 : ");
		String name1 = sc.next();

		System.out.println("1번째 의 1교시 출석여부 : ");
		String 교시1_1 = sc.next();

		System.out.println("1번째 의 2교시 출석여부 : ");
		String 교시1_2 = sc.next();

		System.out.println("1번째 의 3교시 출석여부 : ");
		String 교시1_3 = sc.next();

		System.out.println("2번째 학생명 : ");
		String name2 = sc.next();

		System.out.println("2번째 의 1교시 출석여부 : ");
		String 교시2_1 = sc.next();

		System.out.println("2번째 의 2교시 출석여부 : ");
		String 교시2_2 = sc.next();

		System.out.println("2번째 의 3교시 출석여부 : ");
		String 교시2_3 = sc.next();

		System.out.println("3번째 학생명 : ");
		String name3 = sc.next();

		System.out.println("3번째 의 1교시 출석여부 : ");
		String 교시3_1 = sc.next();

		System.out.println("3번째 의 2교시 출석여부 : ");
		String 교시3_2 = sc.next();

		System.out.println("3번째 의 3교시 출석여부 : ");
		String 교시3_3 = sc.next();

		System.out.println("===========출석부============");
		System.out.println(name1 + "\t" + 교시1_1 + "\t" + 교시1_2 + "\t" + 교시1_3);
		System.out.println(name2 + "\t" + 교시2_1 + "\t" + 교시2_2 + "\t" + 교시2_3);
		System.out.println(name3 + "\t" + 교시3_1 + "\t" + 교시3_2 + "\t" + 교시3_3);
		System.out.println("===========================");

	}
}
